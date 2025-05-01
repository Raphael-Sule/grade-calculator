rm -rf target/pit-reports
mvn clean compile test-compile pitest:mutationCoverage
open target/pit-reports/**/index.html
chmod +x run-mutation.sh

