/**
 * This class contains generated code from the Codename One Designer, DO NOT MODIFY!
 * This class is designed for subclassing that way the code generator can overwrite it
 * anytime without erasing your changes which should exist in a subclass!
 * For details about this file and how it works please read this blog post:
 * http://codenameone.blogspot.com/2010/10/ui-builder-class-how-to-actually-use.html
*/
package generated;

import com.codename1.ui.*;
import com.codename1.ui.util.*;
import com.codename1.ui.plaf.*;
import java.util.Hashtable;
import com.codename1.ui.events.*;

public abstract class StateMachineBase extends UIBuilder {
    private Container aboutToShowThisContainer;
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    /**
    * @deprecated use the version that accepts a resource as an argument instead
    
**/
    protected void initVars() {}

    protected void initVars(Resources res) {}

    public StateMachineBase(Resources res, String resPath, boolean loadTheme) {
        startApp(res, resPath, loadTheme);
    }

    public Container startApp(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("ComponentGroup", com.codename1.ui.ComponentGroup.class);
        UIBuilder.registerCustomComponent("DateTimeSpinner", com.codename1.ui.spinner.DateTimeSpinner.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("TextArea", com.codename1.ui.TextArea.class);
        UIBuilder.registerCustomComponent("Dialog", com.codename1.ui.Dialog.class);
        UIBuilder.registerCustomComponent("ComboBox", com.codename1.ui.ComboBox.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("SpanLabel", com.codename1.components.SpanLabel.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    if(resPath.endsWith(".res")) {
                        res = Resources.open(resPath);
                        System.out.println("Warning: you should construct the state machine without the .res extension to allow theme overlays");
                    } else {
                        res = Resources.openLayered(resPath);
                    }
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        if(res != null) {
            setResourceFilePath(resPath);
            setResourceFile(res);
            initVars(res);
            return showForm(getFirstFormName(), null);
        } else {
            Form f = (Form)createContainer(resPath, getFirstFormName());
            initVars(fetchResourceFile());
            beforeShow(f);
            f.show();
            postShow(f);
            return f;
        }
    }

    protected String getFirstFormName() {
        return "LoginForm";
    }

    public Container createWidget(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("ComponentGroup", com.codename1.ui.ComponentGroup.class);
        UIBuilder.registerCustomComponent("DateTimeSpinner", com.codename1.ui.spinner.DateTimeSpinner.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("TextArea", com.codename1.ui.TextArea.class);
        UIBuilder.registerCustomComponent("Dialog", com.codename1.ui.Dialog.class);
        UIBuilder.registerCustomComponent("ComboBox", com.codename1.ui.ComboBox.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("SpanLabel", com.codename1.components.SpanLabel.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    res = Resources.openLayered(resPath);
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        return createContainer(resPath, "LoginForm");
    }

    protected void initTheme(Resources res) {
            String[] themes = res.getThemeResourceNames();
            if(themes != null && themes.length > 0) {
                UIManager.getInstance().setThemeProps(res.getTheme(themes[0]));
            }
    }

    public StateMachineBase() {
    }

    public StateMachineBase(String resPath) {
        this(null, resPath, true);
    }

    public StateMachineBase(Resources res) {
        this(res, null, true);
    }

    public StateMachineBase(String resPath, boolean loadTheme) {
        this(null, resPath, loadTheme);
    }

    public StateMachineBase(Resources res, boolean loadTheme) {
        this(res, null, loadTheme);
    }

    public com.codename1.components.SpanLabel findDescrL(Component root) {
        return (com.codename1.components.SpanLabel)findByName("descrL", root);
    }

    public com.codename1.components.SpanLabel findDescrL() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("descrL", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("descrL", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComponentGroup findComponentGroup(Component root) {
        return (com.codename1.ui.ComponentGroup)findByName("ComponentGroup", root);
    }

    public com.codename1.ui.ComponentGroup findComponentGroup() {
        com.codename1.ui.ComponentGroup cmp = (com.codename1.ui.ComponentGroup)findByName("ComponentGroup", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComponentGroup)findByName("ComponentGroup", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton1(Component root) {
        return (com.codename1.ui.Button)findByName("Button1", root);
    }

    public com.codename1.ui.Button findButton1() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findConfF(Component root) {
        return (com.codename1.ui.TextField)findByName("confF", root);
    }

    public com.codename1.ui.TextField findConfF() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("confF", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("confF", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel(Component root) {
        return (com.codename1.ui.Label)findByName("Label", root);
    }

    public com.codename1.ui.Label findLabel() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer3(Component root) {
        return (com.codename1.ui.Container)findByName("Container3", root);
    }

    public com.codename1.ui.Container findContainer3() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer4(Component root) {
        return (com.codename1.ui.Container)findByName("Container4", root);
    }

    public com.codename1.ui.Container findContainer4() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container4", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container4", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer1(Component root) {
        return (com.codename1.ui.Container)findByName("Container1", root);
    }

    public com.codename1.ui.Container findContainer1() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer2(Component root) {
        return (com.codename1.ui.Container)findByName("Container2", root);
    }

    public com.codename1.ui.Container findContainer2() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findDescrF(Component root) {
        return (com.codename1.ui.TextArea)findByName("descrF", root);
    }

    public com.codename1.ui.TextArea findDescrF() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("descrF", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("descrF", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer5(Component root) {
        return (com.codename1.ui.Container)findByName("Container5", root);
    }

    public com.codename1.ui.Container findContainer5() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container5", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container5", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer6(Component root) {
        return (com.codename1.ui.Container)findByName("Container6", root);
    }

    public com.codename1.ui.Container findContainer6() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container6", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container6", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer(Component root) {
        return (com.codename1.ui.Container)findByName("Container", root);
    }

    public com.codename1.ui.Container findContainer() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findPassword(Component root) {
        return (com.codename1.ui.TextField)findByName("password", root);
    }

    public com.codename1.ui.TextField findPassword() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("password", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("password", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findCapitalf(Component root) {
        return (com.codename1.ui.TextField)findByName("capitalf", root);
    }

    public com.codename1.ui.TextField findCapitalf() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("capitalf", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("capitalf", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton(Component root) {
        return (com.codename1.ui.Button)findByName("Button", root);
    }

    public com.codename1.ui.Button findButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findOldPass(Component root) {
        return (com.codename1.ui.TextField)findByName("oldPass", root);
    }

    public com.codename1.ui.TextField findOldPass() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("oldPass", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("oldPass", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findRefF(Component root) {
        return (com.codename1.ui.TextField)findByName("refF", root);
    }

    public com.codename1.ui.TextField findRefF() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("refF", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("refF", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findNewPass(Component root) {
        return (com.codename1.ui.TextField)findByName("newPass", root);
    }

    public com.codename1.ui.TextField findNewPass() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("newPass", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("newPass", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findAmtL(Component root) {
        return (com.codename1.ui.Label)findByName("amtL", root);
    }

    public com.codename1.ui.Label findAmtL() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("amtL", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("amtL", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findSpanLabel(Component root) {
        return (com.codename1.components.SpanLabel)findByName("SpanLabel", root);
    }

    public com.codename1.components.SpanLabel findSpanLabel() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("SpanLabel", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("SpanLabel", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findUsename(Component root) {
        return (com.codename1.ui.TextField)findByName("usename", root);
    }

    public com.codename1.ui.TextField findUsename() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("usename", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("usename", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findPassf(Component root) {
        return (com.codename1.ui.TextField)findByName("passf", root);
    }

    public com.codename1.ui.TextField findPassf() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("passf", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("passf", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.spinner.DateTimeSpinner findDateTimeSpinnerF(Component root) {
        return (com.codename1.ui.spinner.DateTimeSpinner)findByName("DateTimeSpinnerF", root);
    }

    public com.codename1.ui.spinner.DateTimeSpinner findDateTimeSpinnerF() {
        com.codename1.ui.spinner.DateTimeSpinner cmp = (com.codename1.ui.spinner.DateTimeSpinner)findByName("DateTimeSpinnerF", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.spinner.DateTimeSpinner)findByName("DateTimeSpinnerF", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton2(Component root) {
        return (com.codename1.ui.Button)findByName("Button2", root);
    }

    public com.codename1.ui.Button findButton2() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findNotMatch(Component root) {
        return (com.codename1.ui.Label)findByName("notMatch", root);
    }

    public com.codename1.ui.Label findNotMatch() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("notMatch", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("notMatch", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findTypeL(Component root) {
        return (com.codename1.ui.Label)findByName("typeL", root);
    }

    public com.codename1.ui.Label findTypeL() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("typeL", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("typeL", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findLogin(Component root) {
        return (com.codename1.ui.Button)findByName("login", root);
    }

    public com.codename1.ui.Button findLogin() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("login", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("login", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel4(Component root) {
        return (com.codename1.ui.Label)findByName("Label4", root);
    }

    public com.codename1.ui.Label findLabel4() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label4", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label4", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComboBox findTypeF(Component root) {
        return (com.codename1.ui.ComboBox)findByName("typeF", root);
    }

    public com.codename1.ui.ComboBox findTypeF() {
        com.codename1.ui.ComboBox cmp = (com.codename1.ui.ComboBox)findByName("typeF", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComboBox)findByName("typeF", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel6(Component root) {
        return (com.codename1.ui.Label)findByName("Label6", root);
    }

    public com.codename1.ui.Label findLabel6() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label6", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label6", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findUserf(Component root) {
        return (com.codename1.ui.TextField)findByName("userf", root);
    }

    public com.codename1.ui.TextField findUserf() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("userf", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("userf", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findAmountF(Component root) {
        return (com.codename1.ui.TextField)findByName("amountF", root);
    }

    public com.codename1.ui.TextField findAmountF() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("amountF", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("amountF", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findAvail(Component root) {
        return (com.codename1.ui.Label)findByName("avail", root);
    }

    public com.codename1.ui.Label findAvail() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("avail", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("avail", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findDescF(Component root) {
        return (com.codename1.ui.TextField)findByName("descF", root);
    }

    public com.codename1.ui.TextField findDescF() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("descF", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("descF", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel1(Component root) {
        return (com.codename1.ui.Label)findByName("Label1", root);
    }

    public com.codename1.ui.Label findLabel1() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel3(Component root) {
        return (com.codename1.ui.Label)findByName("Label3", root);
    }

    public com.codename1.ui.Label findLabel3() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel2(Component root) {
        return (com.codename1.ui.Label)findByName("Label2", root);
    }

    public com.codename1.ui.Label findLabel2() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findBalL(Component root) {
        return (com.codename1.ui.Label)findByName("balL", root);
    }

    public com.codename1.ui.Label findBalL() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("balL", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("balL", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findDateL(Component root) {
        return (com.codename1.ui.Label)findByName("dateL", root);
    }

    public com.codename1.ui.Label findDateL() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("dateL", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("dateL", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findRetypePass(Component root) {
        return (com.codename1.ui.TextField)findByName("retypePass", root);
    }

    public com.codename1.ui.TextField findRetypePass() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("retypePass", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("retypePass", aboutToShowThisContainer);
        }
        return cmp;
    }

    public static final int COMMAND_AboutBack = 12;
    public static final int COMMAND_HomeExit = 6;
    public static final int COMMAND_LoginFormCreate = 7;
    public static final int COMMAND_HomeCreateNewRecords = 3;
    public static final int COMMAND_HomeAbout = 18;
    public static final int COMMAND_LoginFormExit = 10;
    public static final int COMMAND_HomeChangePassword = 4;
    public static final int COMMAND_HomeCharts = 9;
    public static final int COMMAND_MainBack = 11;
    public static final int COMMAND_HomeAddTransaction = 8;
    public static final int COMMAND_HomeDeleteThisRecord = 5;
    public static final int COMMAND_EmptyFormCreate = 14;
    public static final int COMMAND_MainAbout = 17;
    public static final int COMMAND_EmptyFormLogin = 15;
    public static final int COMMAND_LoginFormCommand21 = 21;
    public static final int COMMAND_ChartFormAbout = 13;
    public static final int COMMAND_EmptyFormAbout = 19;
    public static final int COMMAND_EmptyFormExit = 16;

    protected boolean onAboutBack() {
        return false;
    }

    protected boolean onHomeExit() {
        return false;
    }

    protected boolean onLoginFormCreate() {
        return false;
    }

    protected boolean onHomeCreateNewRecords() {
        return false;
    }

    protected boolean onHomeAbout() {
        return false;
    }

    protected boolean onLoginFormExit() {
        return false;
    }

    protected boolean onHomeChangePassword() {
        return false;
    }

    protected boolean onHomeCharts() {
        return false;
    }

    protected boolean onMainBack() {
        return false;
    }

    protected boolean onHomeAddTransaction() {
        return false;
    }

    protected boolean onHomeDeleteThisRecord() {
        return false;
    }

    protected boolean onEmptyFormCreate() {
        return false;
    }

    protected boolean onMainAbout() {
        return false;
    }

    protected boolean onEmptyFormLogin() {
        return false;
    }

    protected boolean onLoginFormCommand21() {
        return false;
    }

    protected boolean onChartFormAbout() {
        return false;
    }

    protected boolean onEmptyFormAbout() {
        return false;
    }

    protected boolean onEmptyFormExit() {
        return false;
    }

    protected void processCommand(ActionEvent ev, Command cmd) {
        switch(cmd.getId()) {
            case COMMAND_AboutBack:
                if(onAboutBack()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_HomeExit:
                if(onHomeExit()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_LoginFormCreate:
                if(onLoginFormCreate()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_HomeCreateNewRecords:
                if(onHomeCreateNewRecords()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_HomeAbout:
                if(onHomeAbout()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_LoginFormExit:
                if(onLoginFormExit()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_HomeChangePassword:
                if(onHomeChangePassword()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_HomeCharts:
                if(onHomeCharts()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_MainBack:
                if(onMainBack()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_HomeAddTransaction:
                if(onHomeAddTransaction()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_HomeDeleteThisRecord:
                if(onHomeDeleteThisRecord()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_EmptyFormCreate:
                if(onEmptyFormCreate()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_MainAbout:
                if(onMainAbout()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_EmptyFormLogin:
                if(onEmptyFormLogin()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_LoginFormCommand21:
                if(onLoginFormCommand21()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_ChartFormAbout:
                if(onChartFormAbout()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_EmptyFormAbout:
                if(onEmptyFormAbout()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_EmptyFormExit:
                if(onEmptyFormExit()) {
                    ev.consume();
                    return;
                }
                break;

        }
        if(ev.getComponent() != null) {
            handleComponentAction(ev.getComponent(), ev);
        }
    }

    protected void exitForm(Form f) {
        if("ChartForm".equals(f.getName())) {
            exitChartForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Changepass".equals(f.getName())) {
            exitChangepass(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Entry".equals(f.getName())) {
            exitEntry(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("EmptyForm".equals(f.getName())) {
            exitEmptyForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("LoginForm".equals(f.getName())) {
            exitLoginForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("About".equals(f.getName())) {
            exitAbout(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Detail".equals(f.getName())) {
            exitDetail(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Home".equals(f.getName())) {
            exitHome(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            exitMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void exitChartForm(Form f) {
    }


    protected void exitChangepass(Form f) {
    }


    protected void exitEntry(Form f) {
    }


    protected void exitEmptyForm(Form f) {
    }


    protected void exitLoginForm(Form f) {
    }


    protected void exitAbout(Form f) {
    }


    protected void exitDetail(Form f) {
    }


    protected void exitHome(Form f) {
    }


    protected void exitMain(Form f) {
    }

    protected void beforeShow(Form f) {
    aboutToShowThisContainer = f;
        if("ChartForm".equals(f.getName())) {
            beforeChartForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Changepass".equals(f.getName())) {
            beforeChangepass(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Entry".equals(f.getName())) {
            beforeEntry(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("EmptyForm".equals(f.getName())) {
            beforeEmptyForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("LoginForm".equals(f.getName())) {
            beforeLoginForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("About".equals(f.getName())) {
            beforeAbout(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Detail".equals(f.getName())) {
            beforeDetail(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Home".equals(f.getName())) {
            beforeHome(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            beforeMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeChartForm(Form f) {
    }


    protected void beforeChangepass(Form f) {
    }


    protected void beforeEntry(Form f) {
    }


    protected void beforeEmptyForm(Form f) {
    }


    protected void beforeLoginForm(Form f) {
    }


    protected void beforeAbout(Form f) {
    }


    protected void beforeDetail(Form f) {
    }


    protected void beforeHome(Form f) {
    }


    protected void beforeMain(Form f) {
    }

    protected void beforeShowContainer(Container c) {
        aboutToShowThisContainer = c;
        if("ChartForm".equals(c.getName())) {
            beforeContainerChartForm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Changepass".equals(c.getName())) {
            beforeContainerChangepass(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Entry".equals(c.getName())) {
            beforeContainerEntry(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("EmptyForm".equals(c.getName())) {
            beforeContainerEmptyForm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("LoginForm".equals(c.getName())) {
            beforeContainerLoginForm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("About".equals(c.getName())) {
            beforeContainerAbout(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Detail".equals(c.getName())) {
            beforeContainerDetail(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Home".equals(c.getName())) {
            beforeContainerHome(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            beforeContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeContainerChartForm(Container c) {
    }


    protected void beforeContainerChangepass(Container c) {
    }


    protected void beforeContainerEntry(Container c) {
    }


    protected void beforeContainerEmptyForm(Container c) {
    }


    protected void beforeContainerLoginForm(Container c) {
    }


    protected void beforeContainerAbout(Container c) {
    }


    protected void beforeContainerDetail(Container c) {
    }


    protected void beforeContainerHome(Container c) {
    }


    protected void beforeContainerMain(Container c) {
    }

    protected void postShow(Form f) {
        if("ChartForm".equals(f.getName())) {
            postChartForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Changepass".equals(f.getName())) {
            postChangepass(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Entry".equals(f.getName())) {
            postEntry(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("EmptyForm".equals(f.getName())) {
            postEmptyForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("LoginForm".equals(f.getName())) {
            postLoginForm(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("About".equals(f.getName())) {
            postAbout(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Detail".equals(f.getName())) {
            postDetail(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Home".equals(f.getName())) {
            postHome(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            postMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postChartForm(Form f) {
    }


    protected void postChangepass(Form f) {
    }


    protected void postEntry(Form f) {
    }


    protected void postEmptyForm(Form f) {
    }


    protected void postLoginForm(Form f) {
    }


    protected void postAbout(Form f) {
    }


    protected void postDetail(Form f) {
    }


    protected void postHome(Form f) {
    }


    protected void postMain(Form f) {
    }

    protected void postShowContainer(Container c) {
        if("ChartForm".equals(c.getName())) {
            postContainerChartForm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Changepass".equals(c.getName())) {
            postContainerChangepass(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Entry".equals(c.getName())) {
            postContainerEntry(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("EmptyForm".equals(c.getName())) {
            postContainerEmptyForm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("LoginForm".equals(c.getName())) {
            postContainerLoginForm(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("About".equals(c.getName())) {
            postContainerAbout(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Detail".equals(c.getName())) {
            postContainerDetail(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Home".equals(c.getName())) {
            postContainerHome(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            postContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postContainerChartForm(Container c) {
    }


    protected void postContainerChangepass(Container c) {
    }


    protected void postContainerEntry(Container c) {
    }


    protected void postContainerEmptyForm(Container c) {
    }


    protected void postContainerLoginForm(Container c) {
    }


    protected void postContainerAbout(Container c) {
    }


    protected void postContainerDetail(Container c) {
    }


    protected void postContainerHome(Container c) {
    }


    protected void postContainerMain(Container c) {
    }

    protected void onCreateRoot(String rootName) {
        if("ChartForm".equals(rootName)) {
            onCreateChartForm();
            aboutToShowThisContainer = null;
            return;
        }

        if("Changepass".equals(rootName)) {
            onCreateChangepass();
            aboutToShowThisContainer = null;
            return;
        }

        if("Entry".equals(rootName)) {
            onCreateEntry();
            aboutToShowThisContainer = null;
            return;
        }

        if("EmptyForm".equals(rootName)) {
            onCreateEmptyForm();
            aboutToShowThisContainer = null;
            return;
        }

        if("LoginForm".equals(rootName)) {
            onCreateLoginForm();
            aboutToShowThisContainer = null;
            return;
        }

        if("About".equals(rootName)) {
            onCreateAbout();
            aboutToShowThisContainer = null;
            return;
        }

        if("Detail".equals(rootName)) {
            onCreateDetail();
            aboutToShowThisContainer = null;
            return;
        }

        if("Home".equals(rootName)) {
            onCreateHome();
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(rootName)) {
            onCreateMain();
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void onCreateChartForm() {
    }


    protected void onCreateChangepass() {
    }


    protected void onCreateEntry() {
    }


    protected void onCreateEmptyForm() {
    }


    protected void onCreateLoginForm() {
    }


    protected void onCreateAbout() {
    }


    protected void onCreateDetail() {
    }


    protected void onCreateHome() {
    }


    protected void onCreateMain() {
    }

    protected Hashtable getFormState(Form f) {
        Hashtable h = super.getFormState(f);
        if("ChartForm".equals(f.getName())) {
            getStateChartForm(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Changepass".equals(f.getName())) {
            getStateChangepass(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Entry".equals(f.getName())) {
            getStateEntry(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("EmptyForm".equals(f.getName())) {
            getStateEmptyForm(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("LoginForm".equals(f.getName())) {
            getStateLoginForm(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("About".equals(f.getName())) {
            getStateAbout(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Detail".equals(f.getName())) {
            getStateDetail(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Home".equals(f.getName())) {
            getStateHome(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Main".equals(f.getName())) {
            getStateMain(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

            return h;
    }


    protected void getStateChartForm(Form f, Hashtable h) {
    }


    protected void getStateChangepass(Form f, Hashtable h) {
    }


    protected void getStateEntry(Form f, Hashtable h) {
    }


    protected void getStateEmptyForm(Form f, Hashtable h) {
    }


    protected void getStateLoginForm(Form f, Hashtable h) {
    }


    protected void getStateAbout(Form f, Hashtable h) {
    }


    protected void getStateDetail(Form f, Hashtable h) {
    }


    protected void getStateHome(Form f, Hashtable h) {
    }


    protected void getStateMain(Form f, Hashtable h) {
    }

    protected void setFormState(Form f, Hashtable state) {
        super.setFormState(f, state);
        if("ChartForm".equals(f.getName())) {
            setStateChartForm(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Changepass".equals(f.getName())) {
            setStateChangepass(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Entry".equals(f.getName())) {
            setStateEntry(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("EmptyForm".equals(f.getName())) {
            setStateEmptyForm(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("LoginForm".equals(f.getName())) {
            setStateLoginForm(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("About".equals(f.getName())) {
            setStateAbout(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Detail".equals(f.getName())) {
            setStateDetail(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Home".equals(f.getName())) {
            setStateHome(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            setStateMain(f, state);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void setStateChartForm(Form f, Hashtable state) {
    }


    protected void setStateChangepass(Form f, Hashtable state) {
    }


    protected void setStateEntry(Form f, Hashtable state) {
    }


    protected void setStateEmptyForm(Form f, Hashtable state) {
    }


    protected void setStateLoginForm(Form f, Hashtable state) {
    }


    protected void setStateAbout(Form f, Hashtable state) {
    }


    protected void setStateDetail(Form f, Hashtable state) {
    }


    protected void setStateHome(Form f, Hashtable state) {
    }


    protected void setStateMain(Form f, Hashtable state) {
    }

    protected boolean setListModel(List cmp) {
        String listName = cmp.getName();
        if("typeF".equals(listName)) {
            return initListModelTypeF(cmp);
        }
        return super.setListModel(cmp);
    }

    protected boolean initListModelTypeF(List cmp) {
        return false;
    }

    protected void handleComponentAction(Component c, ActionEvent event) {
        Container rootContainerAncestor = getRootAncestor(c);
        if(rootContainerAncestor == null) return;
        String rootContainerName = rootContainerAncestor.getName();
        Container leadParentContainer = c.getParent().getLeadParent();
        if(leadParentContainer != null && leadParentContainer.getClass() != Container.class) {
            c = c.getParent().getLeadParent();
        }
        if(rootContainerName == null) return;
        if(rootContainerName.equals("Changepass")) {
            if("oldPass".equals(c.getName())) {
                onChangepass_OldPassAction(c, event);
                return;
            }
            if("newPass".equals(c.getName())) {
                onChangepass_NewPassAction(c, event);
                return;
            }
            if("retypePass".equals(c.getName())) {
                onChangepass_RetypePassAction(c, event);
                return;
            }
            if("Button".equals(c.getName())) {
                onChangepass_ButtonAction(c, event);
                return;
            }
            if("Button1".equals(c.getName())) {
                onChangepass_Button1Action(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Entry")) {
            if("amountF".equals(c.getName())) {
                onEntry_AmountFAction(c, event);
                return;
            }
            if("typeF".equals(c.getName())) {
                onEntry_TypeFAction(c, event);
                return;
            }
            if("refF".equals(c.getName())) {
                onEntry_RefFAction(c, event);
                return;
            }
            if("descF".equals(c.getName())) {
                onEntry_DescFAction(c, event);
                return;
            }
            if("Button".equals(c.getName())) {
                onEntry_ButtonAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("LoginForm")) {
            if("usename".equals(c.getName())) {
                onLoginForm_UsenameAction(c, event);
                return;
            }
            if("password".equals(c.getName())) {
                onLoginForm_PasswordAction(c, event);
                return;
            }
            if("login".equals(c.getName())) {
                onLoginForm_LoginAction(c, event);
                return;
            }
            if("Button".equals(c.getName())) {
                onLoginForm_ButtonAction(c, event);
                return;
            }
            if("Button1".equals(c.getName())) {
                onLoginForm_Button1Action(c, event);
                return;
            }
            if("Button2".equals(c.getName())) {
                onLoginForm_Button2Action(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Home")) {
            if("Button".equals(c.getName())) {
                onHome_ButtonAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Main")) {
            if("userf".equals(c.getName())) {
                onMain_UserfAction(c, event);
                return;
            }
            if("passf".equals(c.getName())) {
                onMain_PassfAction(c, event);
                return;
            }
            if("confF".equals(c.getName())) {
                onMain_ConfFAction(c, event);
                return;
            }
            if("capitalf".equals(c.getName())) {
                onMain_CapitalfAction(c, event);
                return;
            }
            if("descrF".equals(c.getName())) {
                onMain_DescrFAction(c, event);
                return;
            }
            if("Button".equals(c.getName())) {
                onMain_ButtonAction(c, event);
                return;
            }
        }
    }

      protected void onChangepass_OldPassAction(Component c, ActionEvent event) {
      }

      protected void onChangepass_NewPassAction(Component c, ActionEvent event) {
      }

      protected void onChangepass_RetypePassAction(Component c, ActionEvent event) {
      }

      protected void onChangepass_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onChangepass_Button1Action(Component c, ActionEvent event) {
      }

      protected void onEntry_AmountFAction(Component c, ActionEvent event) {
      }

      protected void onEntry_TypeFAction(Component c, ActionEvent event) {
      }

      protected void onEntry_RefFAction(Component c, ActionEvent event) {
      }

      protected void onEntry_DescFAction(Component c, ActionEvent event) {
      }

      protected void onEntry_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onLoginForm_UsenameAction(Component c, ActionEvent event) {
      }

      protected void onLoginForm_PasswordAction(Component c, ActionEvent event) {
      }

      protected void onLoginForm_LoginAction(Component c, ActionEvent event) {
      }

      protected void onLoginForm_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onLoginForm_Button1Action(Component c, ActionEvent event) {
      }

      protected void onLoginForm_Button2Action(Component c, ActionEvent event) {
      }

      protected void onHome_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onMain_UserfAction(Component c, ActionEvent event) {
      }

      protected void onMain_PassfAction(Component c, ActionEvent event) {
      }

      protected void onMain_ConfFAction(Component c, ActionEvent event) {
      }

      protected void onMain_CapitalfAction(Component c, ActionEvent event) {
      }

      protected void onMain_DescrFAction(Component c, ActionEvent event) {
      }

      protected void onMain_ButtonAction(Component c, ActionEvent event) {
      }

}
