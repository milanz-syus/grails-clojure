grails.project.dependency.resolution = {

    inherits('global') {
    }

    repositories {        
        grailsPlugins()
        grailsHome()
        grailsCentral()
        mavenCentral()

        // mavenRepo 'http://build.clojure.org/releases'
        mavenRepo 'https://oss.sonatype.org/content/groups/public'
        // see https://oss.sonatype.org/content/groups/public/org/clojure/clojure/1.5.1/
    }

    dependencies {
        runtime 'org.clojure:clojure:1.5.1'
        // runtime 'org.clojure:clojure:1.2.0'
    }
}