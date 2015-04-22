package com.myself.source.page;

import com.myself.source.page.Dialect;
import com.myself.source.page.Page;

public class OracleDialect implements Dialect {

	public String getPageSql(String sql, int offset, int limit) {
		return null;
	}

	public String getPageSql(String sql, Page<?> page) {
		return null;
	}

}
