package com.heroicg12.database;

import org.hibernate.dialect.MySQL5Dialect;

public class CustomMySQLDialect extends MySQL5Dialect {
    @Override
    public boolean dropConstraints() {
        return false;
    }
}
