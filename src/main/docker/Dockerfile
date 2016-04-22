FROM qaware-oss-docker-registry.bintray.io/base/debian8-jre8
MAINTAINER QAware GmbH <qaware-oss@qaware.de>
COPY dockerWizard.jar /opt/dockerWizard/dockerWizard.jar
COPY docker-wizard-config.yaml /opt/dockerWizard/docker-wizard-config.yaml
EXPOSE 2890
ENTRYPOINT java -jar /opt/dockerWizard/dockerWizard.jar server /opt/dockerWizard/docker-wizard-config.yaml