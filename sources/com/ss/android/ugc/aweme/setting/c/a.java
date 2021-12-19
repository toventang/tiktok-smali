package com.ss.android.ugc.aweme.setting.c;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.content.b;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.base.livedata.a;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.profile.api.BlockApi;
import com.ss.android.ugc.aweme.profile.model.BlockStruct;
import com.ss.android.ugc.aweme.profile.model.StoryBlockInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.ExecutionException;

public final class a extends RecyclerView.ViewHolder implements View.OnClickListener, WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    AvatarImageView f122138a;

    /* renamed from: b  reason: collision with root package name */
    TextView f122139b;

    /* renamed from: c  reason: collision with root package name */
    TextView f122140c;

    /* renamed from: d  reason: collision with root package name */
    View f122141d;

    /* renamed from: e  reason: collision with root package name */
    User f122142e;

    /* renamed from: f  reason: collision with root package name */
    int f122143f;

    /* renamed from: g  reason: collision with root package name */
    int f122144g;

    /* renamed from: h  reason: collision with root package name */
    boolean f122145h;

    /* renamed from: i  reason: collision with root package name */
    private Activity f122146i;

    /* renamed from: j  reason: collision with root package name */
    private Button f122147j;

    /* renamed from: k  reason: collision with root package name */
    private WeakHandler f122148k = new WeakHandler(this);

    static {
        Covode.recordClassIndex(80077);
    }

    private static boolean a() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        int i2;
        int i3;
        int i4;
        if (z) {
            Button button = this.f122147j;
            if (this.f122145h) {
                i3 = R.string.h3j;
            } else {
                i3 = R.string.h3i;
            }
            button.setText(i3);
            Button button2 = this.f122147j;
            if (this.f122144g == 0) {
                i4 = R.drawable.azt;
            } else {
                i4 = R.drawable.azu;
            }
            button2.setBackgroundResource(i4);
            this.f122147j.setTextColor(b.c(d.a(), R.color.bx));
            return;
        }
        Button button3 = this.f122147j;
        if (this.f122145h) {
            i2 = R.string.a6n;
        } else {
            i2 = R.string.a6k;
        }
        button3.setText(i2);
        this.f122147j.setBackgroundResource(R.drawable.azs);
        this.f122147j.setTextColor(b.c(d.a(), R.color.a_));
    }

    /* access modifiers changed from: package-private */
    public final void b(boolean z) {
        BlockApi.a(this.f122148k, this.f122142e.getUid(), this.f122142e.getSecUid(), !z ? 1 : 0, this.f122143f);
        if (z) {
            com.ss.android.ugc.aweme.setting.utils.f.a(this.f122142e.getUid());
            com.ss.android.ugc.aweme.im.f.a("black_list", this.f122142e.getUid());
            return;
        }
        com.ss.android.ugc.aweme.setting.utils.f.a(this.f122142e.getUid());
        com.ss.android.ugc.aweme.im.f.a("black_list", this.f122142e.getUid(), "");
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        int i2;
        int i3;
        if (!this.f122146i.isFinishing()) {
            int i4 = message.what;
            Object obj = message.obj;
            if (i4 == 31 || i4 == 32) {
                if (obj instanceof ExecutionException) {
                    obj = ((ExecutionException) obj).getCause();
                }
                if (obj instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(d.a()).a(((com.ss.android.ugc.aweme.base.api.a.b.a) obj).getErrorMsg()).a();
                } else if (obj instanceof Exception) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(d.a()).a(R.string.de2).a();
                } else if (obj instanceof BlockStruct) {
                    int i5 = ((BlockStruct) obj).blockStatus;
                    boolean z = true;
                    if (i5 != 1) {
                        z = false;
                    }
                    if (i4 == 32) {
                        StoryBlockInfo storyBlockInfo = this.f122142e.getStoryBlockInfo();
                        if (storyBlockInfo == null) {
                            storyBlockInfo = new StoryBlockInfo();
                            this.f122142e.setStoryBlockInfo(storyBlockInfo);
                        }
                        storyBlockInfo.setBlock(z);
                        a(storyBlockInfo.isBlock());
                        Resources resources = this.f122146i.getResources();
                        if (z) {
                            i3 = R.string.a6o;
                        } else {
                            i3 = R.string.h3k;
                        }
                        new com.ss.android.ugc.aweme.tux.a.i.a(d.a()).a(resources.getString(i3)).a();
                    } else {
                        this.f122142e.setBlock(z);
                        Activity activity = this.f122146i;
                        if (activity != null) {
                            com.ss.android.ugc.aweme.tux.a.i.a aVar = new com.ss.android.ugc.aweme.tux.a.i.a(activity);
                            Resources resources2 = activity.getResources();
                            if (z) {
                                i2 = R.string.t7;
                            } else {
                                i2 = R.string.h3i;
                            }
                            aVar.a(resources2.getString(i2)).a();
                        }
                        a(this.f122142e.isBlock());
                    }
                    a.C1541a.f68149a.a("aweme.main.profile.more_page_user_info_change").postValue(this.f122142e);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x008d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r5) {
        /*
        // Method dump skipped, instructions count: 187
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.c.a.onClick(android.view.View):void");
    }

    public a(View view, Activity activity) {
        super(view);
        this.f122146i = activity;
        this.f122138a = (AvatarImageView) view.findViewById(R.id.th);
        this.f122139b = (TextView) view.findViewById(R.id.ti);
        this.f122140c = (TextView) view.findViewById(R.id.tj);
        this.f122141d = view.findViewById(R.id.tk);
        this.f122147j = (Button) view.findViewById(R.id.tg);
        com.ss.android.ugc.aweme.notification.g.a.a(this.f122141d);
        com.ss.android.ugc.aweme.notification.g.a.a(this.f122147j);
        this.f122141d.setOnClickListener(this);
        this.f122147j.setOnClickListener(this);
    }
}
