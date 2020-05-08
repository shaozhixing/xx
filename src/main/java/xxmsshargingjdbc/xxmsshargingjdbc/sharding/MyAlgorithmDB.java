package xxmsshargingjdbc.xxmsshargingjdbc.sharding;

import io.shardingsphere.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.PreciseShardingAlgorithm;
import xxmsshargingjdbc.xxmsshargingjdbc.utils.ApplicationContextUtils;

import java.util.Collection;

/**
 * @author: shaozhixing
 * @date: 2020/5/8 22:16
 * @copyright: gofun
 */
public class MyAlgorithmDB implements PreciseShardingAlgorithm<String> {

    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<String> preciseShardingValue) {
        ShardingJdbcConfig config = ApplicationContextUtils.getBean(ShardingJdbcConfig.class);
        String value = preciseShardingValue.getValue();
        int length = value.length();
        int ascii = value.charAt(length - 1);
        String suffix = ascii % config.getTableNode() + "";
        for(String targetTableName : collection) {
            if(targetTableName.endsWith(suffix)) {
                return targetTableName;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String value = "d7rxezrmzojb75mlse7ouvyewigc2img";
        int length = value.length();
        int ascii = value.charAt(length - 1);
        String suffix = ascii % 2 + "";
        System.out.println(suffix);
    }

}
