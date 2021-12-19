package com.ss.android.ugc.aweme.im.sdk.chat.data.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.d.a.b;
import h.f.b.l;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public String f100240a;

    /* renamed from: b  reason: collision with root package name */
    public NewLiveRoomStruct f100241b;

    static {
        Covode.recordClassIndex(63897);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f100240a, aVar.f100240a) && l.a(this.f100241b, aVar.f100241b);
    }

    public final int hashCode() {
        String str = this.f100240a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        NewLiveRoomStruct newLiveRoomStruct = this.f100241b;
        if (newLiveRoomStruct != null) {
            i2 = newLiveRoomStruct.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ImRoomStatusEvent(uid=" + this.f100240a + ", room=" + this.f100241b + ")";
    }

    public a(String str, NewLiveRoomStruct newLiveRoomStruct) {
        l.d(str, "");
        this.f100240a = str;
        this.f100241b = newLiveRoomStruct;
    }
}
