import io.fabric8.openshift.client.OpenShiftConfig;
import io.fabric8.openshift.client.OpenShiftConfigBuilder;

public class SimpleClient {

    public static void tryCreateClientConfig() {
        OpenShiftConfig config = new OpenShiftConfigBuilder().withTrustCerts(true).withNamespace("test").build();
    }

}
