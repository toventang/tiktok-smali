package com.ss.android.ugc.aweme.account.loginsetting;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.Collections;
import java.util.List;

public class LoginSettingResponse {
    @c(a = "data")
    private List<SettingInfo> data;
    @c(a = "status_code")
    private int status_code;
    @c(a = "status_msg")
    private String status_msg;

    static {
        Covode.recordClassIndex(40036);
    }

    public static class SettingInfo {
        @c(a = "button_dialog")
        private String button_dialog;
        private String dialog_content;
        private String dialog_title;
        @c(a = "error_codes")
        private List<Integer> error_codes;
        public boolean has_logined_successfully_in_history;
        @c(a = "jump_type")
        private int jump_type;
        @c(a = "jump_url")
        private String jump_url;
        private String l_button_dialog;
        @c(a = "l_jump_type")
        private int l_jump_type;
        @c(a = "l_jump_url")
        private String l_jump_url;
        private int login_platform;
        @c(a = "plan_type")
        private int plan_type;
        public String platform = "";
        private String r_button_dialog;
        @c(a = "r_jump_type")
        private int r_jump_type;
        @c(a = "r_jump_url")
        private String r_jump_url;
        public String secUid = "";

        static {
            Covode.recordClassIndex(40037);
        }

        public String getButton_dialog() {
            return this.button_dialog;
        }

        public String getDialog_content() {
            return this.dialog_content;
        }

        public String getDialog_title() {
            return this.dialog_title;
        }

        public int getJump_type() {
            return this.jump_type;
        }

        public String getJump_url() {
            return this.jump_url;
        }

        public String getL_button_dialog() {
            return this.l_button_dialog;
        }

        public int getL_jump_type() {
            return this.l_jump_type;
        }

        public String getL_jump_url() {
            return this.l_jump_url;
        }

        public int getLogin_platform() {
            return this.login_platform;
        }

        public int getPlan_type() {
            return this.plan_type;
        }

        public String getR_button_dialog() {
            return this.r_button_dialog;
        }

        public int getR_jump_type() {
            return this.r_jump_type;
        }

        public String getR_jump_url() {
            return this.r_jump_url;
        }

        public List<Integer> getError_codes() {
            List<Integer> list = this.error_codes;
            if (list == null) {
                return Collections.EMPTY_LIST;
            }
            return list;
        }

        public SettingInfo() {
        }

        public void setButton_dialog(String str) {
            this.button_dialog = str;
        }

        public void setDialog_content(String str) {
            this.dialog_content = str;
        }

        public void setDialog_title(String str) {
            this.dialog_title = str;
        }

        public void setError_codes(List<Integer> list) {
            this.error_codes = list;
        }

        public void setJump_type(int i2) {
            this.jump_type = i2;
        }

        public void setJump_url(String str) {
            this.jump_url = str;
        }

        public void setL_button_dialog(String str) {
            this.l_button_dialog = str;
        }

        public void setL_jump_type(int i2) {
            this.l_jump_type = i2;
        }

        public void setL_jump_url(String str) {
            this.l_jump_url = str;
        }

        public void setLogin_platform(int i2) {
            this.login_platform = i2;
        }

        public void setPlan_type(int i2) {
            this.plan_type = i2;
        }

        public void setR_button_dialog(String str) {
            this.r_button_dialog = str;
        }

        public void setR_jump_type(int i2) {
            this.r_jump_type = i2;
        }

        public void setR_jump_url(String str) {
            this.r_jump_url = str;
        }

        public SettingInfo(String str, String str2, String str3, String str4) {
            this.dialog_title = str;
            this.dialog_content = str2;
            this.l_button_dialog = str3;
            this.r_button_dialog = str4;
        }
    }

    public int getStatus_code() {
        return this.status_code;
    }

    public String getStatus_msg() {
        return this.status_msg;
    }

    public List<SettingInfo> getData() {
        List<SettingInfo> list = this.data;
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        return list;
    }

    public void setData(List<SettingInfo> list) {
        this.data = list;
    }

    public void setStatus_code(int i2) {
        this.status_code = i2;
    }

    public void setStatus_msg(String str) {
        this.status_msg = str;
    }
}
