package com.ss.android.ugc.aweme.discover.h;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.helper.i;
import com.ss.android.ugc.aweme.discover.helper.j;
import com.ss.android.ugc.aweme.discover.helper.k;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.music.model.MusicTag;
import com.ss.android.ugc.aweme.search.g.e;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import java.util.Map;

public interface b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f80998a = a.f80999a;

    static {
        Covode.recordClassIndex(50355);
    }

    SpannableString a(Context context, String str, List<? extends Position> list);

    Fragment a(String str, boolean z, e eVar);

    a a(ViewGroup viewGroup);

    c a();

    k a(k.b bVar);

    void a(androidx.fragment.app.e eVar, Fragment fragment, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, Map<String, String> map);

    void a(RecyclerView recyclerView, List<MusicTag> list, View.OnClickListener onClickListener);

    void a(i.a aVar);

    void a(com.ss.android.ugc.aweme.search.g.b bVar, Fragment fragment);

    void a(String str, Fragment fragment);

    void a(String str, MusicModel musicModel, int i2);

    void a(String str, MusicModel musicModel, int i2, String str2);

    boolean a(String str);

    j b();

    com.ss.android.ugc.aweme.discover.mixfeed.e.a b(ViewGroup viewGroup);

    RecyclerView.ViewHolder c(ViewGroup viewGroup);

    boolean c();

    RecyclerView.ViewHolder d(ViewGroup viewGroup);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f80999a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(50356);
        }
    }
}
