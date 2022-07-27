package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.demo.DesignUser;

@Controller
public class DesignUserListController {

	@Autowired
	private DesignUserList designUserList;

	@RequestMapping(path = "/designuserlist", method = RequestMethod.GET)
	String index(Model model) {
		List<DesignUser> list = this.designUserList.getUserList();
	    model.addAttribute("list", list);
	    return "designUserList";
	}
}