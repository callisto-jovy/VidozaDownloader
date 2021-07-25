package net.bplaced.abzzezz.vidozadownloader.util.cache;

public class Cache {

    private final long insertTime;
    private final long expiration;

    public Cache(final long insertTime, final long expiration) {
        this.insertTime = insertTime;
        this.expiration = expiration;
    }

    public long getExpiration() {
        return expiration;
    }

    public long getInsertTime() {
        return insertTime;
    }
}
