# ViewPager2 Transformers (Animations)
[![](https://jitpack.io/v/AtifSayings/ViewPager2-Transformers.svg)](https://jitpack.io/#AtifSayings/ViewPager2-Transformers)

Used to add different types of animations in ViewPager2.
* min SDK 16 (Android Jellybean 4.1)
* written in Java cann be used in both java and Kotlin

A lightweight and fully customizable library to annimate your ViewPager2

## Screenshots
<div align="center">
    <img src="https://github.com/mohammadatif/CircularImageView/blob/master/screenshots/screen1.png" width="300px"</img> 
    <img src="https://github.com/mohammadatif/CircularImageView/blob/master/screenshots/screen2.png" width="300px"</img> 
</div>

## Installation

Add this into your root build.gradle file:

```java
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

OR. In Newer Versions of Android Studio  settings.gradle file:

```java
pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven { url 'https://jitpack.io' }
        jcenter()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url 'https://jitpack.io' }
        jcenter()
    }
}
```

Add the dependency to your module build.gradle:
```java
dependencies {
	implementation 'com.github.AtifSayings:ViewPager2-Transformers:1.0.1'
}
```
## Usage
### Programatically
```java
01) binding.viewPager2.setPageTransformer(new ViewPagerAccordionTransformer());
02) binding.viewPager2.setPageTransformer(new ViewPagerAntiClockSpinTransformer());
```

