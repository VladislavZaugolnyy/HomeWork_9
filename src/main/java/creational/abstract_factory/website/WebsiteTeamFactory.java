package creational.abstract_factory.website;

import creational.abstract_factory.Developer;
import creational.abstract_factory.ProjectManager;
import creational.abstract_factory.ProjectTeamFactory;
import creational.abstract_factory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    public Tester getTester() {
        return new ManualTester();
    }

    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
