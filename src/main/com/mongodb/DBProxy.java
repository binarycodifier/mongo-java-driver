package com.mongodb;

public class DBProxy extends DB {

    public DBProxy(Mongo mongo, String name) {
        super(mongo, name);
    }

    @Override
    public void requestStart() {
        throw new RuntimeException("Not supported by DB Proxy");
    }

    @Override
    public void requestDone() {
        throw new RuntimeException("Not supported by DB Proxy");
    }

    @Override
    public void requestEnsureConnection() {
        throw new RuntimeException("Not supported by DB Proxy");
    }

    @Override
    protected DBCollection doGetCollection(String name) {
        throw new RuntimeException("Not supported by DB Proxy");
    }

    @Override
    public String toString(){
        return getName();
    }

    @Override
    public void cleanCursors(boolean force) {
        throw new RuntimeException("Not supported by DB Proxy");
    }
}
