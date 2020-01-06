package com.hw.dc3.project.beijing.sourcedataget.nwp.grid.climate;

import com.hw.commons.lang.type.TDateTime;
import com.hw.dc3.project.beijing.sourcedataget.nwp.climate.entity.QhtjToCgtj;
import com.hw.dc3.project.beijing.sourcedataget.nwp.grid.client.ClimateData;
import com.hw.hwcdp3.publiccode.log.SystemLog;

public class ClimateTest {

	public static void main(String[] args) {

		String host = "10.224.47.203";
		int port = 7788;
		ClimateData cli = new ClimateData(host, port);

		QhtjToCgtj qhjt = new QhtjToCgtj();
		qhjt.setElename("平均气温");
		qhjt.setStartTime("2019-01-01 00:00:00");
		qhjt.setEndTime("2019-01-10 00:00:00");
		qhjt.setSiteInfo("54433");
		String clistr = cli.getClimateQhtjCgtj(qhjt.getStartTime(), qhjt.getEndTime(), qhjt.getElename(),
				qhjt.getSiteInfo());
		System.out.println(clistr);
	}
}
