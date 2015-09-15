package io.vertx.redis;

import io.vertx.codegen.annotations.VertxGen;

@VertxGen
public enum RedisCommand {

  APPEND("APPEND"),
  AUTH("AUTH"),
  BGREWRITEAOF("BGREWRITEAOF"),
  BGSAVE("BGSAVE"),
  BITCOUNT("BITCOUNT"),
  BITOP("BITOP"),
  BITPOS("BITPOS"),
  BLPOP("BLPOP"),
  BRPOP("BRPOP"),
  BRPOPLPUSH("BRPOPLPUSH"),
  CLIENT_KILL("CLIENT KILL"),
  CLIENT_LIST("CLIENT LIST"),
  CLIENT_GETNAME("CLIENT GETNAME"),
  CLIENT_PAUSE("CLIENT PAUSE"),
  CLIENT_SETNAME("CLIENT SETNAME"),
  CLUSTER_ADDSLOTS("CLUSTER ADDSLOTS"),
  CLUSTER_COUNT_FAILURE_REPORTS("CLUSTER COUNT-FAILURE-REPORTS"),
  CLUSTER_COUNTKEYSINSLOT("CLUSTER COUNTKEYSINSLOT"),
  CLUSTER_DELSLOTS("CLUSTER DELSLOTS"),
  CLUSTER_FAILOVER("CLUSTER FAILOVER"),
  CLUSTER_FORGET("CLUSTER FORGET"),
  CLUSTER_GETKEYSINSLOT("CLUSTER GETKEYSINSLOT"),
  CLUSTER_INFO("CLUSTER INFO"),
  CLUSTER_KEYSLOT("CLUSTER KEYSLOT"),
  CLUSTER_MEET("CLUSTER MEET"),
  CLUSTER_NODES("CLUSTER NODES"),
  CLUSTER_REPLICATE("CLUSTER REPLICATE"),
  CLUSTER_RESET("CLUSTER RESET"),
  CLUSTER_SAVECONFIG("CLUSTER SAVECONFIG"),
  CLUSTER_SET_CONFIG_EPOCH("CLUSTER SET-CONFIG-EPOCH"),
  CLUSTER_SETSLOT("CLUSTER SETSLOT"),
  CLUSTER_SLAVES("CLUSTER SLAVES"),
  CLUSTER_SLOTS("CLUSTER SLOTS"),
  COMMAND("COMMAND"),
  COMMAND_COUNT("COMMAND COUNT"),
  COMMAND_GETKEYS("COMMAND GETKEYS"),
  COMMAND_INFO("COMMAND INFO"),
  CONFIG_GET("CONFIG GET"),
  CONFIG_REWRITE("CONFIG REWRITE"),
  CONFIG_SET("CONFIG SET"),
  CONFIG_RESETSTAT("CONFIG RESETSTAT"),
  DBSIZE("DBSIZE"),
  DEBUG_OBJECT("DEBUG OBJECT"),
  DEBUG_SEGFAULT("DEBUG SEGFAULT"),
  DECR("DECR"),
  DECRBY("DECRBY"),
  DEL("DEL"),
  DISCARD("DISCARD"),
  DUMP("DUMP"),
  ECHO("ECHO"),
  EVAL("EVAL"),
  EVALSHA("EVALSHA"),
  EXEC("EXEC"),
  EXISTS("EXISTS"),
  EXPIRE("EXPIRE"),
  EXPIREAT("EXPIREAT"),
  FLUSHALL("FLUSHALL"),
  FLUSHDB("FLUSHDB"),
  GET("GET"),
  GETBIT("GETBIT"),
  GETRANGE("GETRANGE"),
  GETSET("GETSET"),
  HDEL("HDEL"),
  HEXISTS("HEXISTS"),
  HGET("HGET"),
  HGETALL("HGETALL"),
  HINCRBY("HINCRBY"),
  HINCRBYFLOAT("HINCRBYFLOAT"),
  HKEYS("HKEYS"),
  HLEN("HLEN"),
  HMGET("HMGET"),
  HMSET("HMSET"),
  HSET("HSET"),
  HSETNX("HSETNX"),
  HSTRLEN("HSTRLEN"),
  HVALS("HVALS"),
  INCR("INCR"),
  INCRBY("INCRBY"),
  INCRBYFLOAT("INCRBYFLOAT"),
  INFO("INFO"),
  KEYS("KEYS"),
  LASTSAVE("LASTSAVE"),
  LINDEX("LINDEX"),
  LINSERT("LINSERT"),
  LLEN("LLEN"),
  LPOP("LPOP"),
  LPUSH("LPUSH"),
  LPUSHX("LPUSHX"),
  LRANGE("LRANGE"),
  LREM("LREM"),
  LSET("LSET"),
  LTRIM("LTRIM"),
  MGET("MGET"),
  MIGRATE("MIGRATE"),
  MONITOR("MONITOR"),
  MOVE("MOVE"),
  MSET("MSET"),
  MSETNX("MSETNX"),
  MULTI("MULTI"),
  OBJECT("OBJECT"),
  PERSIST("PERSIST"),
  PEXPIRE("PEXPIRE"),
  PEXPIREAT("PEXPIREAT"),
  PFADD("PFADD"),
  PFCOUNT("PFCOUNT"),
  PFMERGE("PFMERGE"),
  PING("PING"),
  PSETEX("PSETEX"),
  PSUBSCRIBE("PSUBSCRIBE"),
  PUBSUB("PUBSUB"),
  PTTL("PTTL"),
  PUBLISH("PUBLISH"),
  PUNSUBSCRIBE("PUNSUBSCRIBE"),
  QUIT("QUIT"),
  RANDOMKEY("RANDOMKEY"),
  RENAME("RENAME"),
  RENAMENX("RENAMENX"),
  RESTORE("RESTORE"),
  ROLE("ROLE"),
  RPOP("RPOP"),
  RPOPLPUSH("RPOPLPUSH"),
  RPUSH("RPUSH"),
  RPUSHX("RPUSHX"),
  SADD("SADD"),
  SAVE("SAVE"),
  SCARD("SCARD"),
  SCRIPT_EXISTS("SCRIPT EXISTS"),
  SCRIPT_FLUSH("SCRIPT FLUSH"),
  SCRIPT_KILL("SCRIPT KILL"),
  SCRIPT_LOAD("SCRIPT LOAD"),
  SDIFF("SDIFF"),
  SDIFFSTORE("SDIFFSTORE"),
  SELECT("SELECT"),
  SET("SET"),
  SETBIT("SETBIT"),
  SETEX("SETEX"),
  SETNX("SETNX"),
  SETRANGE("SETRANGE"),
  SHUTDOWN("SHUTDOWN"),
  SINTER("SINTER"),
  SINTERSTORE("SINTERSTORE"),
  SISMEMBER("SISMEMBER"),
  SLAVEOF("SLAVEOF"),
  SLOWLOG("SLOWLOG"),
  SMEMBERS("SMEMBERS"),
  SMOVE("SMOVE"),
  SORT("SORT"),
  SPOP("SPOP"),
  SRANDMEMBER("SRANDMEMBER"),
  SREM("SREM"),
  STRLEN("STRLEN"),
  SUBSCRIBE("SUBSCRIBE"),
  SUNION("SUNION"),
  SUNIONSTORE("SUNIONSTORE"),
  SYNC("SYNC"),
  TIME("TIME"),
  TTL("TTL"),
  TYPE("TYPE"),
  UNSUBSCRIBE("UNSUBSCRIBE"),
  UNWATCH("UNWATCH"),
  WAIT("WAIT"),
  WATCH("WATCH"),
  ZADD("ZADD"),
  ZCARD("ZCARD"),
  ZCOUNT("ZCOUNT"),
  ZINCRBY("ZINCRBY"),
  ZINTERSTORE("ZINTERSTORE"),
  ZLEXCOUNT("ZLEXCOUNT"),
  ZRANGE("ZRANGE"),
  ZRANGEBYLEX("ZRANGEBYLEX"),
  ZREVRANGEBYLEX("ZREVRANGEBYLEX"),
  ZRANGEBYSCORE("ZRANGEBYSCORE"),
  ZRANK("ZRANK"),
  ZREM("ZREM"),
  ZREMRANGEBYLEX("ZREMRANGEBYLEX"),
  ZREMRANGEBYRANK("ZREMRANGEBYRANK"),
  ZREMRANGEBYSCORE("ZREMRANGEBYSCORE"),
  ZREVRANGE("ZREVRANGE"),
  ZREVRANGEBYSCORE("ZREVRANGEBYSCORE"),
  ZREVRANK("ZREVRANK"),
  ZSCORE("ZSCORE"),
  ZUNIONSTORE("ZUNIONSTORE"),
  SCAN("SCAN"),
  SSCAN("SSCAN"),
  HSCAN("HSCAN"),
  ZSCAN("ZSCAN");

  private final String[] tokens;

  RedisCommand(String command) {
    this.tokens = command.split(" ");
  }

  public String[] getTokens() {
    return tokens;
  }
}
