# Description

* This repository is a quick example of the ExoPlayer's bug described in ticket https://github.com/google/ExoPlayer/issues/1160
* The code from the package be.xzan.demo.exoplayerbug.player is copied from https://github.com/google/ExoPlayer/tree/master/demo/src/main/java/com/google/android/exoplayer/demo/player from revision 1.5.6
* The code for the PlayerActivity has been copied from https://github.com/google/ExoPlayer/blob/master/demo/src/main/java/com/google/android/exoplayer/demo/PlayerActivity.java  from revision 1.5.6
The code in PlayerActivity has been trimmed down to the very basic to focus on the black screen problem and show this is not caused by any other code.

# How to witness the problem

When launching the video **without** the transition, the bird's cry is heard while the picture is appearing.
When launching the video **with** the transition, the bird's cry is heard while the picture is still black.