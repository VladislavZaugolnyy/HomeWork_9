package creational.abstract_factory.website;

import creational.abstract_factory.ProjectManager;

public class WebsitePM implements ProjectManager {
    public void manageProject() {
        System.out.println("Website PM manages website project");
    }
}
