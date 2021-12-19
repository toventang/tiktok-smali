package com.ss.android.ugc.aweme.choosemusic.widgets;

import android.content.Intent;
import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.ss.android.ugc.aweme.arch.widgets.a;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity;
import com.ss.android.ugc.aweme.choosemusic.model.ag;
import com.ss.android.ugc.aweme.choosemusic.viewholder.p;
import com.zhiliaoapp.musically.R;
import java.util.List;

public class MusicClassWidget extends ListItemWidget<p> implements u<b>, au {

    /* renamed from: h  reason: collision with root package name */
    public int f71051h;

    /* renamed from: i  reason: collision with root package name */
    public int f71052i;

    /* renamed from: j  reason: collision with root package name */
    public int f71053j;

    /* renamed from: k  reason: collision with root package name */
    public int f71054k;

    static {
        Covode.recordClassIndex(43739);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.k, com.ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onCreate() {
        super.onCreate();
        this.f67010e.a("list", (u<b>) this);
        this.f71053j = ((Integer) this.f67010e.a("key_choose_music_type")).intValue();
    }

    public MusicClassWidget(int i2) {
        this.f71054k = i2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public /* synthetic */ void onChanged(b bVar) {
        b bVar2 = bVar;
        if (((ListItemWidget) this).f66990a != null) {
            String str = bVar2.f67014a;
            str.hashCode();
            if (str.equals("list")) {
                a((List) bVar2.a());
            }
        }
    }

    private void a(List<Object> list) {
        if (list != null && list.size() > 0) {
            ((p) ((ListItemWidget) this).f66990a).a(((ag) list.get(this.f71051h)).f70616a, this.f71053j);
            ((p) ((ListItemWidget) this).f66990a).f70940e = new com.ss.android.ugc.aweme.music.b.b() {
                /* class com.ss.android.ugc.aweme.choosemusic.widgets.MusicClassWidget.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(43740);
                }

                @Override // com.ss.android.ugc.aweme.music.b.b
                public final void a(View view) {
                    if (view.getId() == R.id.f9p) {
                        Intent intent = new Intent(MusicClassWidget.this.f67007b, MusicDetailListActivity.class);
                        intent.putExtra("music_type", 4);
                        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", MusicClassWidget.this.f71053j);
                        intent.putExtra("sound_page_scene", MusicClassWidget.this.f71054k);
                        MusicClassWidget musicClassWidget = MusicClassWidget.this;
                        musicClassWidget.a(intent, musicClassWidget.f71052i);
                    }
                }
            };
            ((p) ((ListItemWidget) this).f66990a).f70941f = new f(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public final void a(a aVar) {
        super.a(aVar);
        a((List) this.f67010e.a("list"));
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void a(int i2, int i3, Intent intent) {
        if (i3 == -1 && i2 == this.f71052i) {
            d().setResult(-1, intent);
            d().finish();
        }
    }
}
