package xxmsshargingjdbc.xxmsshargingjdbc.sharding;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "shardxx")
public class ShardingJdbcConfig {

    private int shardNode;

    public int getShardNode() {
        return shardNode;
    }

    public void setShardNode(int shardNode) {
        this.shardNode = shardNode;
    }
}
