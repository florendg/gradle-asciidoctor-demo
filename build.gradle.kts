plugins {
    id("org.asciidoctor.jvm.convert") version "3.1.0"
    id("org.asciidoctor.jvm.pdf") version "3.1.0"
}

repositories {
    mavenCentral()
}

asciidoctorj {
    getModules().getPdf().version("1.2.3")
    getModules().getPdf().use()
}
