package com.bytedance.android.livesdk.chatroom.ui;

import android.view.View;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.ui.bg;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class bh implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final bg f15967a;

    static {
        Covode.recordClassIndex(8832);
    }

    bh(bg bgVar) {
        this.f15967a = bgVar;
    }

    public final void onClick(View view) {
        int indexOf;
        String str;
        bg bgVar = this.f15967a;
        int id = view.getId();
        if (id == R.id.rj) {
            if (!bgVar.f15950i) {
                if (bgVar.f15949h) {
                    bgVar.f15949h = false;
                    bgVar.f15954m.a();
                } else {
                    bgVar.f15949h = true;
                    bgVar.f15954m.a(true);
                }
                bgVar.d();
            }
        } else if (id == R.id.czj && !bgVar.f15950i) {
            if (bgVar.f15947f == bg.a.Panel) {
                bgVar.f15947f = bg.a.Keyboard;
            } else {
                bgVar.f15947f = bg.a.Panel;
                if (!(bgVar.r == null || bgVar.q == bgVar.r)) {
                    bgVar.q = bgVar.r;
                    if (bgVar.f15946e && (indexOf = bgVar.v.indexOf(bgVar.q)) != -1) {
                        bgVar.a(indexOf);
                        bgVar.n.setCurrentItem(indexOf, false);
                    }
                }
            }
            bgVar.f15952k.post(new bm(bgVar, bgVar.f15947f));
            bgVar.f();
            if (bgVar.f15947f == bg.a.Keyboard) {
                str = "emoji_to_keyboard";
            } else {
                str = "keyboard_to_emoji";
            }
            b.a.a("livesdk_emoji_keyboard_click").a().a("click_pattern", str).b();
        }
    }
}
