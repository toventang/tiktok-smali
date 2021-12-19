package com.ss.avframework.livestreamv2.core;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.utils.TEBundle;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public class GameLauncherParameter extends TEBundle {
    private WeakReference<Activity> mActivityWeakReference;
    private JSONObject mLaunchOpt;
    private final String mSchemaKey = "schema";

    static {
        Covode.recordClassIndex(100049);
    }

    public JSONObject getLaunchOpt() {
        return this.mLaunchOpt;
    }

    public GameLauncherParameter() {
    }

    public Activity getActivity() {
        WeakReference<Activity> weakReference = this.mActivityWeakReference;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public String getSchema() {
        if (contains("schema")) {
            return getString("schema");
        }
        return null;
    }

    public boolean isTest() {
        if (!contains("game-test") || !getBool("game-test")) {
            return false;
        }
        return true;
    }

    @Override // com.ss.avframework.utils.TEBundle
    public String toString() {
        String str;
        StringBuilder append = new StringBuilder().append(super.toString()).append(",activity(").append(this.mActivityWeakReference).append("),launchOpt:");
        JSONObject jSONObject = this.mLaunchOpt;
        if (jSONObject != null) {
            str = jSONObject.toString();
        } else {
            str = "";
        }
        return append.append(str).toString();
    }

    public GameLauncherParameter setLaunchOpt(JSONObject jSONObject) {
        this.mLaunchOpt = jSONObject;
        return this;
    }

    public GameLauncherParameter setActivity(Activity activity) {
        this.mActivityWeakReference = new WeakReference<>(activity);
        return this;
    }

    public GameLauncherParameter setSchema(String str) {
        if (str != null) {
            setString("schema", str);
        }
        return this;
    }

    public GameLauncherParameter setTest(boolean z) {
        setBool("game-test", z);
        return this;
    }

    public GameLauncherParameter(TEBundle tEBundle) {
        super(tEBundle);
    }
}
