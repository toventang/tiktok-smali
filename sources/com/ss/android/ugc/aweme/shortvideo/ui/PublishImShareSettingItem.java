package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.shortvideo.model.ImShareContactListStruct;
import h.f.b.l;
import java.util.ArrayList;

public final class PublishImShareSettingItem extends LinearLayout {
    static {
        Covode.recordClassIndex(85935);
    }

    public PublishImShareSettingItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final ImShareContactListStruct getSelectedContactList() {
        return new ImShareContactListStruct(new ArrayList());
    }

    private /* synthetic */ PublishImShareSettingItem(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private PublishImShareSettingItem(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(10193);
        MethodCollector.o(10193);
    }
}
