package exec;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@Cucumber.Options(
        features = "features",//path to the features
        tags = {"@busca"},
        glue = {"steps_definition"})//what tags to incluse(@)/exclude(@~)

public class exec {
}
