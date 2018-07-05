package science.mengxin.java.kafka.cucumber.stepdefs;

import science.mengxin.java.kafka.KafkaDemoApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = KafkaDemoApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
