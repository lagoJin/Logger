# Logger

![DOWNLOAD](https://jitpack.io/v/lagoJin/Logger.svg)


## Setup

~~~
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
~~~

Add the Dependency
~~~~
implementation 'com.github.lagoJin:Logger:0.1.0'
~~~~


Initialize

```kotlin
class AppApplication :Application(){

 override fun onCreate() {
        Logger.init(BuildConfig.DEBUG, this.packageName)
        super.onCreate()
    }
}
```


And use
```kotlin
Logger.v("Hello World")
```

## License

	Copyright (C) 2019 lagoJin.
	
	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at
	
	   http://www.apache.org/licenses/LICENSE-2.0
	
	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
