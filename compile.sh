#JBOSS_HOME must have for value the path to wildfly folder
export JBOSS_HOME=Wildfly_saved_folder/wildfly-15.0.1.Final
ant archive
cp dist/ForumWithStruts.war $JBOSS_HOME/standalone/deployments
