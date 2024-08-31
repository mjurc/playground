## Reproducer for ConfigBuilder binary compatibility issue

This is a very simple reproducer for [fabric8 ConfigBuilder binary compatibility issue](https://github.com/fabric8io/kubernetes-client/issues/6249).

One module has a method using ConfigBuilder, the other runs a test that runs
the method with specified version of fabric8 OpenShift client.

To run the reproducer:
```
mvn clean install -Dfabric8.openshift-client.build-version=${COMPILE_TIME_VERSION} -Dfabric8.openshift-client.runtime-version=${RUNTIME_VERSION}
```

For example, the following combinations will make the test fail:
```
mvn clean install -Dfabric8.openshift-client.build-version=6.13.1 -Dfabric8.openshift-client.runtime-version=6.13.3
mvn clean install -Dfabric8.openshift-client.build-version=6.13.3 -Dfabric8.openshift-client.runtime-version=6.13.1
```