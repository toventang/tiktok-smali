package com.ss.android.ugc.aweme.profile.a;

import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.model.PostGuideTasks;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.p;
import h.v;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class t extends RecyclerView.ViewHolder {
    static {
        Covode.recordClassIndex(74763);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(View view) {
        super(view);
        l.d(view, "");
        r.a("optimize_profile", new d().a("enter_from", "personal_homepage").a("action_type", "show").a("optimize_type", "edit_profile").f66730a);
        view.findViewById(R.id.d_d).setOnClickListener(AnonymousClass1.f115928a);
        r.a("optimize_profile", new d().a("enter_from", "personal_homepage").a("action_type", "show").a("optimize_type", "find_friends").f66730a);
        view.findViewById(R.id.b7a).setOnClickListener(AnonymousClass2.f115929a);
        r.a("optimize_profile", new d().a("enter_from", "personal_homepage").a("action_type", "show").a("optimize_type", "shoot").f66730a);
        view.findViewById(R.id.e30).setOnClickListener(AnonymousClass3.f115930a);
    }

    public final void a(PostGuideTasks postGuideTasks) {
        int i2;
        MethodCollector.i(8785);
        l.d(postGuideTasks, "");
        View view = this.itemView;
        l.b(view, "");
        Resources resources = view.getResources();
        Matcher matcher = Pattern.compile("\\d/\\d").matcher("");
        ViewGroup viewGroup = null;
        if (!matcher.find()) {
            matcher = null;
        }
        if (matcher != null) {
            p pVar = new p(Integer.valueOf(matcher.start()), Integer.valueOf(matcher.end()));
            View findViewById = this.itemView.findViewById(R.id.dby);
            l.b(findViewById, "");
            SpannableString spannableString = new SpannableString("");
            spannableString.setSpan(new ForegroundColorSpan(resources.getColor(R.color.bx)), ((Number) pVar.getFirst()).intValue(), ((Number) pVar.getSecond()).intValue(), 17);
            ((TextView) findViewById).setText(spannableString);
        } else {
            View findViewById2 = this.itemView.findViewById(R.id.dby);
            l.b(findViewById2, "");
            ((TextView) findViewById2).setText("");
        }
        View findViewById3 = this.itemView.findViewById(R.id.dby);
        l.b(findViewById3, "");
        ((TextView) findViewById3).setVisibility(8);
        int i3 = 0;
        p[] pVarArr = {v.a(this.itemView.findViewById(R.id.d_d), Boolean.valueOf(postGuideTasks.isProfileTaskDone)), v.a(this.itemView.findViewById(R.id.b7a), Boolean.valueOf(postGuideTasks.isFollowTaskDone)), v.a(this.itemView.findViewById(R.id.e30), Boolean.valueOf(postGuideTasks.isShootTaskDone))};
        View view2 = this.itemView;
        if (view2 instanceof ViewGroup) {
            viewGroup = view2;
        }
        ViewGroup viewGroup2 = viewGroup;
        if (viewGroup2 != null) {
            int i4 = 0;
            do {
                p pVar2 = pVarArr[i4];
                viewGroup2.removeView((View) pVar2.getFirst());
                Object first = pVar2.getFirst();
                l.b(first, "");
                View view3 = (View) first;
                boolean booleanValue = ((Boolean) pVar2.getSecond()).booleanValue();
                View findViewById4 = view3.findViewById(R.id.a51);
                l.b(findViewById4, "");
                int i5 = 4;
                if (booleanValue) {
                    i2 = 4;
                } else {
                    i2 = 0;
                }
                findViewById4.setVisibility(i2);
                View findViewById5 = view3.findViewById(R.id.aoh);
                l.b(findViewById5, "");
                if (booleanValue) {
                    i5 = 0;
                }
                findViewById5.setVisibility(i5);
                i4++;
            } while (i4 < 3);
            int i6 = 0;
            do {
                p pVar3 = pVarArr[i6];
                if (!((Boolean) pVar3.getSecond()).booleanValue()) {
                    viewGroup2.addView((View) pVar3.getFirst());
                }
                i6++;
            } while (i6 < 3);
            do {
                p pVar4 = pVarArr[i3];
                if (((Boolean) pVar4.getSecond()).booleanValue()) {
                    viewGroup2.addView((View) pVar4.getFirst());
                }
                i3++;
            } while (i3 < 3);
        }
        View findViewById6 = this.itemView.findViewById(R.id.b7a).findViewById(R.id.edi);
        l.b(findViewById6, "");
        ((TextView) findViewById6).setText("");
        MethodCollector.o(8785);
    }
}
