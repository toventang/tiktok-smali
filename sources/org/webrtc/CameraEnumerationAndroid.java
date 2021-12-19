package org.webrtc;

import android.graphics.ImageFormat;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CameraEnumerationAndroid {
    static final ArrayList<Size> COMMON_RESOLUTIONS = new ArrayList<>(Arrays.asList(new Size(160, 120), new Size(240, 160), new Size(320, 240), new Size(400, 240), new Size(480, 320), new Size(640, 360), new Size(640, 480), new Size(768, 480), new Size(854, 480), new Size(800, 600), new Size(960, 540), new Size(960, 640), new Size(1024, 576), new Size(1024, 600), new Size(1280, 720), new Size(1280, 1024), new Size(1920, 1080), new Size(1920, 1440), new Size(2560, 1440), new Size(3840, 2160)));

    static abstract class ClosestComparator<T> implements Comparator<T> {
        static {
            Covode.recordClassIndex(106538);
        }

        /* access modifiers changed from: package-private */
        public abstract int diff(T t);

        private ClosestComparator() {
        }

        @Override // java.util.Comparator
        public int compare(T t, T t2) {
            return diff(t) - diff(t2);
        }
    }

    public static class CaptureFormat {
        public final FramerateRange framerate;
        public final int height;
        public final int imageFormat = 17;
        public final int width;

        static {
            Covode.recordClassIndex(106536);
        }

        public static class FramerateRange {
            public int max;
            public int min;

            static {
                Covode.recordClassIndex(106537);
            }

            public int hashCode() {
                return (this.min * 65537) + 1 + this.max;
            }

            public String toString() {
                return "[" + (((float) this.min) / 1000.0f) + ":" + (((float) this.max) / 1000.0f) + "]";
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof FramerateRange)) {
                    return false;
                }
                FramerateRange framerateRange = (FramerateRange) obj;
                if (this.min == framerateRange.min && this.max == framerateRange.max) {
                    return true;
                }
                return false;
            }

            public FramerateRange(int i2, int i3) {
                this.min = i2;
                this.max = i3;
            }
        }

        public int frameSize() {
            return frameSize(this.width, this.height, 17);
        }

        public int hashCode() {
            return (((this.width * 65497) + this.height) * 251) + 1 + this.framerate.hashCode();
        }

        public String toString() {
            return this.width + "x" + this.height + "@" + this.framerate;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof CaptureFormat)) {
                return false;
            }
            CaptureFormat captureFormat = (CaptureFormat) obj;
            if (this.width == captureFormat.width && this.height == captureFormat.height && this.framerate.equals(captureFormat.framerate)) {
                return true;
            }
            return false;
        }

        public CaptureFormat(int i2, int i3, FramerateRange framerateRange) {
            this.width = i2;
            this.height = i3;
            this.framerate = framerateRange;
        }

        public static int frameSize(int i2, int i3, int i4) {
            if (i4 == 17) {
                return ((i2 * i3) * ImageFormat.getBitsPerPixel(i4)) / 8;
            }
            throw new UnsupportedOperationException("Don't know how to calculate the frame size of non-NV21 image formats.");
        }

        public CaptureFormat(int i2, int i3, int i4, int i5) {
            this.width = i2;
            this.height = i3;
            this.framerate = new FramerateRange(i4, i5);
        }
    }

    static {
        Covode.recordClassIndex(106533);
    }

    public static CaptureFormat.FramerateRange getClosestSupportedFramerateRange(List<CaptureFormat.FramerateRange> list, final int i2) {
        return (CaptureFormat.FramerateRange) Collections.min(list, new ClosestComparator<CaptureFormat.FramerateRange>() {
            /* class org.webrtc.CameraEnumerationAndroid.AnonymousClass1 */

            static {
                Covode.recordClassIndex(106534);
            }

            private int progressivePenalty(int i2, int i3, int i4, int i5) {
                return i2 < i3 ? i2 * i4 : (i4 * i3) + ((i2 - i3) * i5);
            }

            /* access modifiers changed from: package-private */
            public final int diff(CaptureFormat.FramerateRange framerateRange) {
                return progressivePenalty(Math.abs((i2 * 1000) - framerateRange.min), 5000, 1, 3) + progressivePenalty(Math.abs((i2 * 1000) - framerateRange.max), 5000, 1, 3);
            }
        });
    }

    static void reportCameraResolution(Histogram histogram, Size size) {
        histogram.addSample(COMMON_RESOLUTIONS.indexOf(size) + 1);
    }

    public static Size getClosestSupportedSize(List<Size> list, final int i2, final int i3) {
        return (Size) Collections.min(list, new ClosestComparator<Size>() {
            /* class org.webrtc.CameraEnumerationAndroid.AnonymousClass2 */

            static {
                Covode.recordClassIndex(106535);
            }

            /* access modifiers changed from: package-private */
            public final int diff(Size size) {
                return Math.abs(i2 - size.width) + Math.abs(i3 - size.height);
            }
        });
    }
}
