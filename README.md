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
//setup adapter
AdapterViewPager2Java adapterViewPager2Java = new AdapterViewPager2Java(this, viewPager2JavaArrayList);
//set adapter to view pager
binding.viewPager2.setAdapter(adapterViewPager2Java);
//after setting adapter set one of the following page transforemers
01) binding.viewPager2.setPageTransformer(new ViewPagerAccordionTransformer());
02) binding.viewPager2.setPageTransformer(new ViewPagerAntiClockSpinTransformer());
03) binding.viewPager2.setPageTransformer(new ViewPagerAntiClockSpinTransformer());
04) binding.viewPager2.setPageTransformer(new ViewPagerAntiClockSpinTransformer());
05) binding.viewPager2.setPageTransformer(new ViewPagerAntiClockSpinTransformer());
06) binding.viewPager2.setPageTransformer(new ViewPagerAntiClockSpinTransformer());
07) binding.viewPager2.setPageTransformer(new ViewPagerAntiClockSpinTransformer());
08) binding.viewPager2.setPageTransformer(new ViewPagerAntiClockSpinTransformer());
09) binding.viewPager2.setPageTransformer(new ViewPagerAntiClockSpinTransformer());
10) binding.viewPager2.setPageTransformer(new ViewPagerAntiClockSpinTransformer());
11) binding.viewPager2.setPageTransformer(new ViewPagerAntiClockSpinTransformer());
12) binding.viewPager2.setPageTransformer(new ViewPagerAntiClockSpinTransformer());
13) binding.viewPager2.setPageTransformer(new ViewPagerAntiClockSpinTransformer());
14) binding.viewPager2.setPageTransformer(new ViewPagerAntiClockSpinTransformer());
15) binding.viewPager2.setPageTransformer(new ViewPagerAntiClockSpinTransformer());
16) binding.viewPager2.setPageTransformer(new ViewPagerAntiClockSpinTransformer());
17) binding.viewPager2.setPageTransformer(new ViewPagerAntiClockSpinTransformer());
18) binding.viewPager2.setPageTransformer(new ViewPagerAntiClockSpinTransformer());
19) binding.viewPager2.setPageTransformer(new ViewPagerAntiClockSpinTransformer());
20) binding.viewPager2.setPageTransformer(new ViewPagerAntiClockSpinTransformer());
21) binding.viewPager2.setPageTransformer(new ViewPagerAntiClockSpinTransformer());
22) binding.viewPager2.setPageTransformer(new ViewPagerAntiClockSpinTransformer());
23) binding.viewPager2.setPageTransformer(new ViewPagerAntiClockSpinTransformer());
24) binding.viewPager2.setPageTransformer(new ViewPagerAntiClockSpinTransformer());
25) binding.viewPager2.setPageTransformer(new ViewPagerAntiClockSpinTransformer());
26) binding.viewPager2.setPageTransformer(new ViewPagerAntiClockSpinTransformer());
27) binding.viewPager2.setPageTransformer(new ViewPagerAntiClockSpinTransformer());
28) binding.viewPager2.setPageTransformer(new ViewPagerAntiClockSpinTransformer());
29) binding.viewPager2.setPageTransformer(new ViewPagerAntiClockSpinTransformer());
30) binding.viewPager2.setPageTransformer(new ViewPagerAntiClockSpinTransformer());
```

