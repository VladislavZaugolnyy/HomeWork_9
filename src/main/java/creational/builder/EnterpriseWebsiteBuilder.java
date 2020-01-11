package creational.builder;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder {
    void buildName() {
        website.setName("Enterprise website");
    }

    void buildCms() {
        website.setCms(Cms.ALIFRESCO);
    }

    void buildPrice() {
        website.setPrice(10000);
    }
}
