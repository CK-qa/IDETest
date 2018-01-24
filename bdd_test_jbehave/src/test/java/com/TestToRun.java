package com;

import com.steps.TestSteps;
import org.jbehave.core.io.LoadFromRelativeFile;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class TestToRun extends JUnitStory {

        // Here we specify the configuration, starting from default
        // MostUsefulConfiguration, and changing only what is needed
        @Override
        public Configuration configuration() {
            // where to find the stories
            URL storyURL = null;
            System.out.println(System.getProperty("user.dir"));
            try {
                storyURL = new URL("file://" + System.getProperty("user.dir") + "/src/test/java");
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }

            return  new MostUsefulConfiguration()
                    .useStoryLoader(storyURL != null ? new LoadFromRelativeFile(storyURL) : new LoadFromClasspath(this.getClass()))
                    // CONSOLE and TXT reporting
                    .useStoryReporterBuilder(new StoryReporterBuilder().withDefaultFormats().withFormats(Format.CONSOLE, Format.TXT));
        }


        // Here we specify the steps classes
        @Override
        public List<CandidateSteps> candidateSteps() {
            // varargs, can have more that one steps classes
            return new InstanceStepsFactory(configuration(), new TestSteps.StackSteps())
                    .createCandidateSteps();
        }
}
