package com.ss.avframework.livestreamv2.filter;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public class FindContourInfo {
    public List<ContourItem> contourItemsList = new ArrayList();
    public int mContourItemSize;
    public int mHeight;
    public String mInteractId;
    public int mSize;
    public int mWidth;

    public static class ContourItem {
        public int counts;
        public List<ContourPoint> pointsList = new ArrayList();

        static {
            Covode.recordClassIndex(100382);
        }
    }

    public static class ContourPoint {
        public int x;
        public int y;

        static {
            Covode.recordClassIndex(100383);
        }
    }

    static {
        Covode.recordClassIndex(100381);
    }
}
