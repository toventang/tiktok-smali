package com.ss.android.ugc.aweme.kids.choosemusic.widgets;

import android.content.Intent;
import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.ss.android.ugc.aweme.arch.widgets.a;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.kids.choosemusic.activity.MusicDetailListActivity;
import com.ss.android.ugc.aweme.kids.choosemusic.e.q;
import com.ss.android.ugc.aweme.kids.choosemusic.i.l;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.List;

public class MusicClassWidget extends ListItemWidget<l> implements u<b>, au {

    /* renamed from: h  reason: collision with root package name */
    public int f105851h;

    /* renamed from: i  reason: collision with root package name */
    public int f105852i;

    /* renamed from: j  reason: collision with root package name */
    public int f105853j;

    static {
        Covode.recordClassIndex(67741);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.k, com.ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public void onCreate() {
        super.onCreate();
        this.f67010e.a("list", (u<b>) this);
        this.f105853j = ((Integer) this.f67010e.a("key_choose_music_type")).intValue();
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
            ((l) ((ListItemWidget) this).f66990a).a(((q) list.get(this.f105851h)).f105628a, this.f105853j);
            ((l) ((ListItemWidget) this).f66990a).f105792e = new com.ss.android.ugc.aweme.kids.a.a.b() {
                /* class com.ss.android.ugc.aweme.kids.choosemusic.widgets.MusicClassWidget.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(67742);
                }

                @Override // com.ss.android.ugc.aweme.kids.a.a.b
                public final void a(RecyclerView.ViewHolder viewHolder, View view, MusicModel musicModel) {
                    if (view.getId() == R.id.f9p) {
                        Intent intent = new Intent(MusicClassWidget.this.f67007b, MusicDetailListActivity.class);
                        intent.putExtra("music_type", 4);
                        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", MusicClassWidget.this.f105853j);
                        MusicClassWidget musicClassWidget = MusicClassWidget.this;
                        musicClassWidget.a(intent, musicClassWidget.f105852i);
                    }
                }
            };
            ((l) ((ListItemWidget) this).f66990a).f105793f = new f(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.ListItemWidget
    public final void a(a aVar) {
        super.a(aVar);
        a((List) this.f67010e.a("list"));
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void a(int i2, int i3, Intent intent) {
        if (i3 == -1 && i2 == this.f105852i) {
            d().setResult(-1, intent);
            d().finish();
        }
    }
}
