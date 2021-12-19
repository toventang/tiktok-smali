package com.bytedance.android.c.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.c.a.c;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.ui.SSGridLayoutManager;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public AbstractC0093a f6815a;

    /* renamed from: com.bytedance.android.c.a.a$a  reason: collision with other inner class name */
    public interface AbstractC0093a extends c.a {
        static {
            Covode.recordClassIndex(3274);
        }

        boolean a();

        void b();
    }

    static {
        Covode.recordClassIndex(3273);
    }

    @Override // com.bytedance.android.c.a.c
    public final int a() {
        return 2131234353;
    }

    @Override // com.bytedance.android.c.a.c
    public final void c() {
        AbstractC0093a aVar = this.f6815a;
        if (aVar != null) {
            aVar.b_();
        }
    }

    @Override // com.bytedance.android.c.a.c
    public final void e() {
        AbstractC0093a aVar = this.f6815a;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.bytedance.android.c.a.c
    public final boolean d() {
        AbstractC0093a aVar = this.f6815a;
        if (aVar == null || !aVar.a()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.c.a.c
    public final /* synthetic */ CharSequence b() {
        String string = this.f6833l.getResources().getString(R.string.gye);
        l.b(string, "");
        return string;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        l.d(context, "");
    }

    @Override // com.bytedance.android.c.a.c
    public final void a(boolean z) {
        super.a(z);
        if (z) {
            b.a.a("livesdk_emoji_show").a().b();
        }
    }

    @Override // com.bytedance.android.c.a.c
    public final View a(ViewGroup viewGroup) {
        int i2;
        l.d(viewGroup, "");
        Context context = this.f6833l;
        boolean z = this.f6828g;
        AbstractC0093a aVar = this.f6815a;
        e.f.a aVar2 = new e.f.a(context);
        aVar2.setOnEmojiSelectListener(aVar);
        if (z) {
            i2 = 7;
        } else {
            i2 = 12;
        }
        aVar2.f157060h = i2;
        RecyclerView recyclerView = (RecyclerView) aVar2.findViewById(R.id.cb4);
        aVar2.f157059g = new e.a.a(aVar2.getContext());
        aVar2.f157059g.f157048b = aVar2;
        recyclerView.setAdapter(aVar2.f157059g);
        aVar2.getContext();
        recyclerView.setLayoutManager(new SSGridLayoutManager(aVar2.f157060h, 1));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(36);
        List<com.bytedance.android.live.base.model.emoji.a> a2 = e.a.a().f157045a.a();
        if (!h.a(a2)) {
            ArrayList arrayList = new ArrayList(a2);
            e.a.a aVar3 = aVar2.f157059g;
            aVar3.f157047a.clear();
            if (!arrayList.isEmpty()) {
                aVar3.f157047a.addAll(arrayList);
            }
            aVar2.f157059g.notifyDataSetChanged();
        }
        l.b(aVar2, "");
        return aVar2;
    }
}
