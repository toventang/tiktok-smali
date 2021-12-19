package com.bytedance.ies.dmt.ui.common.rebranding;

import android.content.res.Resources;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;

public final class c {
    static {
        Covode.recordClassIndex(19918);
    }

    public static int a(TextView textView, ArrayList<Integer> arrayList, int i2, int i3) {
        Resources resources = textView.getResources();
        Iterator<Integer> it = arrayList.iterator();
        int i4 = -1;
        while (it.hasNext()) {
            Integer next = it.next();
            int measureText = ((int) textView.getPaint().measureText(resources.getString(next.intValue()))) + textView.getPaddingLeft() + textView.getPaddingRight();
            resources.getString(next.intValue());
            i4 = Math.max(i4, measureText);
        }
        if (i4 >= i2) {
            i2 = i4;
        }
        return i2 > i3 ? i3 : i2;
    }
}
