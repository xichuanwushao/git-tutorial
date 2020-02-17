package org.xichaun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.xichaun.config.LogPower;
import org.xichaun.config.StaticMethod;

public class ThreadUtil {

	static LogPower log  = StaticMethod.getBean(LogPower.class);
	public static void sleep(long seconds)
	{
		log.print("vvvvvvvvvv");
	}
	}
