package ua.com.google;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Пошукова система(SearchingSystem.java)
 * займається тим, що приймає порцію каменів
 * та інструкцію, що необхідно знайти,
 * опісля рахує, скільки камені влаштовують
 * інструкцію та видає результат.*/

public class SearchingSystem {
    private final List<String> stonesList;
    private final List<String> instrutionsList;
    private Result result;

    public SearchingSystem(PortionsStones portionsStones) {
        CreateList operator = (s) -> {
            char[] chars = s.toCharArray();
            List<String> list = new ArrayList<>();

            for (char stone:chars) {
                list.add(String.valueOf(stone));
            }
            return list;
        };

        this.stonesList = operator.createList(portionsStones.getStones());
        this.instrutionsList = operator.createList(portionsStones.getInstrutions());
        this.result = new Result();
    }

    public int getGems(){

        return result.numGems;
    }
    
    private int sumGems(){
        int sum = 0;
        for (String anInstrutionsList : instrutionsList) {
            sum += getGemFor(anInstrutionsList);
        }
        
        return sum;
    }

    private int getGemFor(String oneInstrution){
        List collect = stonesList.stream()
                .filter(o1 -> o1.equals(oneInstrution))
                .collect(Collectors.toList());

        return collect.size();
    }
    /**
     * Заготовка на розширення фнкціоналу*/
    private class Result{
        private int numGems;

        private Result() {
            this.numGems = sumGems();
        }
    }
}
