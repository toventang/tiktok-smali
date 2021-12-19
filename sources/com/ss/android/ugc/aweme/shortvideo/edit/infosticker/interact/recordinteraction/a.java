package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.recordinteraction;

import android.text.TextUtils;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.common.utility.collection.b;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.panel.guide.ExtraParams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class a implements MessageCenter.Listener {

    /* renamed from: a  reason: collision with root package name */
    public String f127575a = "";

    /* renamed from: b  reason: collision with root package name */
    public String f127576b = "";

    /* renamed from: c  reason: collision with root package name */
    public boolean f127577c = true;

    /* renamed from: d  reason: collision with root package name */
    public LinkedHashMap<String, List<NormalTrackTimeStamp>> f127578d = new LinkedHashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public LinkedHashMap<String, ExtraParams> f127579e = new LinkedHashMap<>();

    /* renamed from: f  reason: collision with root package name */
    public int f127580f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f127581g = false;

    static {
        Covode.recordClassIndex(83645);
    }

    public a() {
        MessageCenter.init();
        MessageCenter.addListener(this);
    }

    public final void a(int i2) {
        if (this.f127577c) {
            for (Map.Entry<String, List<NormalTrackTimeStamp>> entry : this.f127578d.entrySet()) {
                List<NormalTrackTimeStamp> value = entry.getValue();
                if (!b.a((Collection) value)) {
                    Iterator<NormalTrackTimeStamp> it = value.iterator();
                    while (it.hasNext()) {
                        if (it.next().getPts() > i2) {
                            it.remove();
                        }
                    }
                }
            }
        }
    }

    public final void a(int i2, ExtraParams extraParams) {
        if (this.f127577c && !m.a(this.f127575a)) {
            ArrayList arrayList = new ArrayList();
            List<NormalTrackTimeStamp> list = this.f127578d.get(this.f127576b);
            if (!b.a((Collection) list)) {
                arrayList.addAll(list);
            }
            try {
                EffectLocationMessage effectLocationMessage = (EffectLocationMessage) c.w.getRetrofitFactoryGson().a(this.f127575a, EffectLocationMessage.class);
                if (!(effectLocationMessage == null || b.a((Collection) effectLocationMessage.locations))) {
                    LinkedList linkedList = new LinkedList();
                    for (EffectLocation effectLocation : effectLocationMessage.locations) {
                        NormalTrackTimeStamp normalTrackTimeStamp = new NormalTrackTimeStamp();
                        normalTrackTimeStamp.setPts(i2);
                        normalTrackTimeStamp.setWidth(effectLocation.getW());
                        normalTrackTimeStamp.setHeight(effectLocation.getH());
                        normalTrackTimeStamp.setX(effectLocation.getX());
                        normalTrackTimeStamp.setY(effectLocation.getY());
                        normalTrackTimeStamp.setScale(Float.valueOf(1.0f));
                        normalTrackTimeStamp.setRotation(effectLocation.getR());
                        linkedList.add(normalTrackTimeStamp);
                    }
                    arrayList.addAll(linkedList);
                    this.f127578d.put(this.f127576b, arrayList);
                    this.f127579e.put(this.f127576b, extraParams);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public final void onMessageReceived(int i2, int i3, int i4, String str) {
        if (i2 == 28) {
            this.f127575a = str;
            if (!this.f127581g && !TextUtils.equals(str, "{\"locations\":[]}")) {
                this.f127581g = true;
            }
        }
    }
}
