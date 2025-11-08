package ExtentsReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.Test;

import java.io.File;

public class ExtentReportManager {
    private static String reportDir=System.getProperty("user.dir")+"/Reports/sourceDemo.html";

    private static ExtentReports extentReports;
    private static ExtentSparkReporter extentsSparkReporter;

    public static ExtentReports extentReports(){
        extentReports = new ExtentReports();
        extentsSparkReporter = new ExtentSparkReporter(new File(reportDir));
        extentReports.attachReporter(extentsSparkReporter);

        extentsSparkReporter.config().setDocumentTitle("Extent Report");
        //extentsSparkReporter.config().setTheme(Theme.DARK);
        extentsSparkReporter.config().setReportName("Source Demo");

        extentReports.setSystemInfo("OS",System.getProperty("OS.name"));
        extentReports.setSystemInfo("Exwcution Machine",System.getProperty("User.name"));

        return extentReports;
    }
   // @Test
    //public void (){
      //  System.out.println(reportDir);
   // }
}

