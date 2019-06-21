#JBOSS_HOME must have for value the path to your web server folder
export JBOSS_HOME=/path-to-your-web-server-folder
ant archive
cp dist/ForumWithStruts.war $JBOSS_HOME/standalone/deployments
