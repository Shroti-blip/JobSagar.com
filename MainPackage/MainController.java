package SagarNaukriMerge.SagarNaukriMerge.MainPackage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/homepage")
    public String homepage()
    {
        return "Homepage/Homecenter";
    }

    @GetMapping("/contact")
    public String contactjob()
    {
        return "Homepage/contactus";
    }

    @GetMapping("/termandcondition")
    public String TermsandConsitions()
    {
        return "Homepage/termandconditions";
    }

    @GetMapping("/home")
    public String FooterCallinghomepage()
    {
        return "Homepage/Homecenter";
    }

    @GetMapping("Companydashboard")
    public String CompanyApplications ()
    {
        return "Company/CompanyDashboard";
    }


}
