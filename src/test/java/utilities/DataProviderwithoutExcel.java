package utilities;

import java.util.Arrays;

import org.testng.annotations.Test;

public class DataProviderwithoutExcel  {
@Test()
	public Object[][] getData() {
		Object[][] data=new Object[1][3];
		data[0][0] ="bss_sahmad";
		data[0][1] ="Bismillah@@90";
		data[0][2] ="581";
		System.out.println(Arrays.toString(data));
		return data;
	}
}
