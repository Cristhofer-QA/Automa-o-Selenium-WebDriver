package support;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import runner.RunCucumberTest;

public class PrintSupport extends RunCucumberTest{
	EsperasSupport espera = new EsperasSupport();
		
	private Date data = new Date();

	public void printTela(String funcionalidade, String cenario, int nr_evidencia)
			throws IOException, InterruptedException {

		SimpleDateFormat formatador = new SimpleDateFormat("dd-MM-yyyy");
		String dataFormatada = formatador.format(data);

		File print = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(print,
				new File("target/Evidencias/Execução " + dataFormatada + "/Funcionalidade - "
						+ funcionalidade + "/Cenario - " + cenario + "/evidencia_" + nr_evidencia + ".png"));
		espera.esperarTempo(100);
	}
}
