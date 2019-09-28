node {
	stage 'Checkout'
		checkout scm

	stage 'Build'
		bat 'nuget restore SeleniumJava.sln'
		bat "\"${tool 'MSBuild'}\" SeleniumJava.sln /p:Configuration=Release /p:Platform=\"Any CPU\" /p:ProductVersion=1.0.0.${env.BUILD_NUMBER}"

	stage 'Archive'
		archive 'ProjectName/bin/Release/**'

}
© 2019 GitHub, Inc.
