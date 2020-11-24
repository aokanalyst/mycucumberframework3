package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        //Path of the features folder
        plugin = {
                "html:target/default-cucumber-reports1",
                "json:target/json-reports/cucumber1.json",
                "junit:target/xml-report/cucumber1.xml"
        },
        features ="src/test/resources/features",
        //Path of the step definations folder
        glue = "stepdefinations",
        //tags="@datatest",   // or we can say "@wip"  to execute means work in progress
        tags= "@datatable",
        //  tags= "@scenario_outline",
        //"@test1 and not @test2",
        dryRun=false
)
public class DataTablesTestRunner {
}
