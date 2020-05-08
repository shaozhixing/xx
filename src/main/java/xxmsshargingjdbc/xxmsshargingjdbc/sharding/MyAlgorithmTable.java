package xxmsshargingjdbc.xxmsshargingjdbc.sharding;

import io.shardingsphere.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.PreciseShardingAlgorithm;
import xxmsshargingjdbc.xxmsshargingjdbc.utils.ApplicationContextUtils;

import java.util.Collection;

/**
 * @Author: wudy
 * @Date: 2019/5/31 12:31
 * @Version 1.0
 * @Desc
 */
public class MyAlgorithmTable implements PreciseShardingAlgorithm<String> {

    private static int nodes = 10;

    public MyAlgorithmTable() {

    }

    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<String> preciseShardingValue) {
        ShardingJdbcConfig config = ApplicationContextUtils.getBean(ShardingJdbcConfig.class);
        String value = preciseShardingValue.getValue();
        int length = value.length();
        int ascii = value.charAt(length - 1);
        String suffix = ascii % config.getShardNode() + "";
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
        String suffix = ascii % 10 + "";
        System.out.println(suffix);
    }

}
