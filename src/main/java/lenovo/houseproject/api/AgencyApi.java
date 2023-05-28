package lenovo.houseproject.api;


import lenovo.houseproject.entity.Agency;
import lenovo.houseproject.service.AgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/agencies")

public class AgencyApi {
    private final AgencyService agencyService;
    @Autowired
    public AgencyApi(AgencyService agencyService) {
        this.agencyService = agencyService;
    }

    @GetMapping("/new")
    public String createAgency(Model model){
        model.addAttribute("newAgency",new Agency());
        return "redirect:/newAgency";
/*    @GetMapping("/new")
    public String createAgency(Model model) {
        model.addAttribute("newAgency", new Agency());
        return "newAgency";*/
    }
    @PostMapping("/newAgency")
    public String save(@ModelAttribute("newAgency") Agency agency){
        agencyService.saveAgency(agency);
        return "redirect:/agencies";
    }
    @GetMapping
    public String getAllAgencies(Model model){
        model.addAttribute("agencies",agencyService.getAllAgencies());
        return "agency/agencyMainPage";
    }
    @GetMapping("/{agencyId}/edit")
    public String getById(@PathVariable Long agencyId, Model model) {
        model.addAttribute("agency",agencyService.getAgencyById(agencyId));
        return "agency/updateAgency";
    }
    @PutMapping("/update/{agencyId}")
    public String update(@PathVariable Long agencyId, @ModelAttribute("agency")Agency agency){
        agencyService.updateAgency(agencyId,agency);
        return "redirect:/agencies";
    }
    @DeleteMapping("/{agencyId}/delete")
    public String delete(@PathVariable Long agencyId){
        agencyService.deleteAgencyById(agencyId);
        return "redirect:/agencies";
    }

}




