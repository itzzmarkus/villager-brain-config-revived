pluginManagement {
	repositories {
		mavenLocal()
		mavenCentral()
		gradlePluginPortal()
		maven("https://maven.fabricmc.net/")
		maven("https://maven.architectury.dev")
		maven("https://maven.minecraftforge.net")
		maven("https://maven.neoforged.net/releases/")
		maven("https://maven.kikugie.dev/snapshots")
		maven("https://maven.kikugie.dev/releases")
		maven("https://maven.txni.dev/releases")
	}  
}

plugins {
	id("dev.architectury.loom") version "1.17.487" apply false
	id("dev.architectury.loom-no-remap") version "1.17.487" apply false
	kotlin("jvm") version "2.1.0" apply false
	kotlin("plugin.serialization") version "2.1.0" apply false
	id("toni.blahaj") version "2.0.0"
	id("dev.kikugie.stonecutter") version "0.6-alpha.5"
}

blahaj {
	init(rootProject) {
		mc("26.2", "neoforge")
		mc("26.2", "fabric")
	}
}

rootProject.name = settings.extra["mod.name"] as String
