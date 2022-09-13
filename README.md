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
//set adapter to view pager2
binding.viewPager2.setAdapter(adapterViewPager2Java);
//after setting adapter set one of the following page transforemers
01) binding.viewPager2.setPageTransformer(new ViewPagerAccordionTransformer());
02) binding.viewPager2.setPageTransformer(new ViewPagerAntiClockSpinTransformer());
03) binding.viewPager2.setPageTransformer(new ViewPagerBackDrawTransformer());
04) binding.viewPager2.setPageTransformer(new ViewPagerBackToForeTransformer());
05) binding.viewPager2.setPageTransformer(new ViewPagerClockSpinTransformer());
06) binding.viewPager2.setPageTransformer(new ViewPagerCubeInDepthTransformer());
07) binding.viewPager2.setPageTransformer(new ViewPagerCubeInScalingTransformer());
08) binding.viewPager2.setPageTransformer(new ViewPagerCubeInTransformer());
09) binding.viewPager2.setPageTransformer(new ViewPagerCubeOutDepthTransformer());
10) binding.viewPager2.setPageTransformer(new ViewPagerCubeOutScalingTransformer());
11) binding.viewPager2.setPageTransformer(new ViewPagerCubeOutTransformer());
12) binding.viewPager2.setPageTransformer(new ViewPagerDefaultTransformer());
13) binding.viewPager2.setPageTransformer(new ViewPagerDepthTransformer());
14) binding.viewPager2.setPageTransformer(new ViewPagerFadeOutTransformer());
15) binding.viewPager2.setPageTransformer(new ViewPagerFanTransformer());
16) binding.viewPager2.setPageTransformer(new ViewPagerFidgetSpinTransformer());
17) binding.viewPager2.setPageTransformer(new ViewPagerForeToBackTransformer());
18) binding.viewPager2.setPageTransformer(new ViewPagerGateTransformer());
19) binding.viewPager2.setPageTransformer(new ViewPagerHingeTransformer());
20) binding.viewPager2.setPageTransformer(new ViewPagerHorizontalFlipTransformer());
21) binding.viewPager2.setPageTransformer(new ViewPagerParallaxTransformer());
22) binding.viewPager2.setPageTransformer(new ViewPagerPopTransformer());
23) binding.viewPager2.setPageTransformer(new ViewPagerRotateDownTransformer());
24) binding.viewPager2.setPageTransformer(new ViewPagerRotateUpTransformer());
25) binding.viewPager2.setPageTransformer(new ViewPagerSpinnerTransformer());
26) binding.viewPager2.setPageTransformer(new ViewPagerStackTransformer());
27) binding.viewPager2.setPageTransformer(new ViewPagerTabletTransformer());
28) binding.viewPager2.setPageTransformer(new ViewPagerTossTransformer());
29) binding.viewPager2.setPageTransformer(new ViewPagerVerticalFlipTransformer());
30) binding.viewPager2.setPageTransformer(new ViewPagerVerticalShutTransformer());
31) binding.viewPager2.setPageTransformer(new ViewPagerZoomInTransformer());
32) binding.viewPager2.setPageTransformer(new ViewPagerZoomOutSlideTransformer());
33) binding.viewPager2.setPageTransformer(new ViewPagerZoomOutTransformer());
```

