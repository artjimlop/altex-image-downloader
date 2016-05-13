# Altex Image Downloader
Android Library for downloading and saving images from given URLs in Android 

Show me how to use it!!!
----------

Saving image into your mobile

```java

AltexImageDownloader.writeToDisk(context, PICTURE_URL, NAME_FOLDER); //NAME_FOLDER is the name of the folder where you want to save the image.

```
Getting a bitmap from a URL

```java

final AltexImageDownloader downloader = new AltexImageDownloader(new OnImageLoaderListener() {
                    @Override
                    public void onError(ImageError error) {
                      // Here you should show something to the user, right?
                    }

                    @Override
                    public void onProgressChange(int percent) {
                       // Here you can show the percentage of progress and stuff
                    }

                    @Override
                    public void onComplete(Bitmap result) {
                        // Do whatever you want, mate
                        });
                    }
                });

```

#I want to use it!!!

* Grab via Gradle:
```groovy
compile 'com.artjimlop:altex-image-downloader:0.0.4'
```
* Grab via Maven:
```xml
<dependency>
  <groupId>com.artjimlop</groupId>
  <artifactId>altex-image-downloader</artifactId>
  <version>0.0.4</version>
  <type>pom</type>
</dependency>
```

#I want to contribute!!!

You are welcome! Please feel free to do Pull Requests or reporting issues.
