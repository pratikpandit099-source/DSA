import java.util.*;

class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        Map<String, List<String>> graph = new HashMap<>();
        Map<String, Integer> indegree = new HashMap<>();

        for (int i = 0; i < recipes.length; i++) {
            indegree.put(recipes[i], ingredients.get(i).size());

            for (String ingredient : ingredients.get(i)) {
                graph.computeIfAbsent(ingredient, k -> new ArrayList<>()).add(recipes[i]);
            }
        }

        Queue<String> queue = new LinkedList<>();

        for (String supply : supplies) {
            queue.offer(supply);
        }

        List<String> result = new ArrayList<>();

        while (!queue.isEmpty()) {
            String item = queue.poll();

            if (graph.containsKey(item)) {
                for (String recipe : graph.get(item)) {
                    indegree.put(recipe, indegree.get(recipe) - 1);

                    if (indegree.get(recipe) == 0) {
                        result.add(recipe);
                        queue.offer(recipe);
                    }
                }
            }
        }

        return result;
    }
}